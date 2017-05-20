package com.team.finn.model.logic.live;

import android.content.Context;

import com.team.finn.api.home.HomeApi;
import com.team.finn.api.live.LiveApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.live.interfaces.LiveAllListContract;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveAllListModelLogic implements LiveAllListContract.Model {

    /**
     *   获取全部视频
     * @param context
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public Observable<List<LiveAllList>> getModelLiveAllList(Context context, int offset, int limit) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(LiveApi.class)
                .getLiveAllList(ParamsMapUtils.getHomeFaceScoreColumn(offset,limit))
//               进行预处理
                .compose(new DefaultTransformer<List<LiveAllList>>());
    }
}
