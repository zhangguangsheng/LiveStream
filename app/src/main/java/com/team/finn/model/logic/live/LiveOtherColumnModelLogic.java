package com.team.finn.model.logic.live;

import android.content.Context;

import com.team.finn.api.home.HomeApi;
import com.team.finn.api.live.LiveApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.model.logic.home.bean.HomeCateList;
import com.team.finn.model.logic.live.bean.LiveOtherColumn;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.live.interfaces.LiveOtherColumnContract;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherColumnModelLogic implements LiveOtherColumnContract.Model{

    @Override
    public Observable<List<LiveOtherColumn>> getModelLiveOtherColumn(Context context) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(LiveApi.class)
                .getLiveOtherColumn(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<LiveOtherColumn>>());
    }
}
