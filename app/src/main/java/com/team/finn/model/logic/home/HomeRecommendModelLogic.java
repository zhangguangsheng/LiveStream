package com.team.finn.model.logic.home;

import android.content.Context;

import com.team.finn.api.home.HomeApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.home.interfaces.HomeRecommendContract;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeRecommendModelLogic implements HomeRecommendContract.Model {

    /**
     *  获取首页轮播图
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeCarousel>> getModelCarousel(Context context) {
        return  HttpUtils.getInstance(context)
                .setLoadDiskCache(false)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getCarousel(ParamsMapUtils.getHomeCarousel())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeCarousel>>());
    }
}
