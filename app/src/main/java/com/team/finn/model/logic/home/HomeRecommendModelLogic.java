package com.team.finn.model.logic.home;

import android.content.Context;

import com.team.finn.api.home.HomeApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.model.logic.home.bean.HomeHotColumn;
import com.team.finn.model.logic.home.bean.HomeRecommendHotCate;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.home.interfaces.HomeRecommendContract;

import java.util.List;

import rx.Observable;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class HomeRecommendModelLogic implements HomeRecommendContract.Model {
    /**
     * 获取首页轮播图
     *
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeCarousel>> getModelCarousel(Context context) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(false)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getCarousel(ParamsMapUtils.getHomeCarousel())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeCarousel>>());
    }

    /**
     * 首页 ---推荐--最热
     *
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeHotColumn>> getModelHotColumn(Context context) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getHotColumn(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeHotColumn>>());
    }

    /**
     * 首页---推荐---颜值
     *
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeFaceScoreColumn>> getModelFaceScoreColumn(Context context,int offset,int limit  ) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getFaceScoreColumn(ParamsMapUtils.getHomeFaceScoreColumn(offset,limit))
//               进行预处理
                .compose(new DefaultTransformer<List<HomeFaceScoreColumn>>());
    }

    /**
     *    首页---推荐---热门种类
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeRecommendHotCate>> getModelHotCate(Context context) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getHotCate(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeRecommendHotCate>>());
    }
}
