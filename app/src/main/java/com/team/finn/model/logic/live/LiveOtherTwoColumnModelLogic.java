package com.team.finn.model.logic.live;

import android.content.Context;

import com.team.finn.api.live.LiveApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.live.interfaces.LiveOtherTwoColumnContract;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherTwoColumnModelLogic implements LiveOtherTwoColumnContract.Model{

    @Override
    public Observable<List<LiveOtherTwoColumn>> getModelLiveOtherTwoColumn(Context context, String mCloumnName) {
        return  HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(LiveApi.class)
                .getLiveOtherTwoColumn(ParamsMapUtils.getLiveOtherTwoColumn(mCloumnName))
//               进行预处理
                .compose(new DefaultTransformer<List<LiveOtherTwoColumn>>());
    }
}
