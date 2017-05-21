package com.team.finn.model.logic.video;

import android.content.Context;

import com.team.finn.api.video.VideoApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.finn.model.logic.video.bean.VideoOtherColumnList;
import com.team.finn.model.logic.video.bean.VideoReClassify;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.video.interfaces.VideoOtherTwoColumnContract;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class VideoTwoColumnModelLogic implements VideoOtherTwoColumnContract.Model{
    @Override
    public Observable<List<VideoOtherColumnList>> getModelVideoOtherTwoColumn(Context context, String  cid1, String cid2, int offset, int limit, String action ) {
        return HttpUtils.getInstance(context)

                .setLoadDiskCache(true)
                .getRetofitClinet()
                .setBaseUrl("http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoOtherColumnList(ParamsMapUtils.getVideoOtherList(cid1,cid2,offset,limit,action))
                .compose(new DefaultTransformer<List<VideoOtherColumnList>>());
    }
}
