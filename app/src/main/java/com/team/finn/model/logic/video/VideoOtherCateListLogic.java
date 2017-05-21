package com.team.finn.model.logic.video;

import android.content.Context;

import com.team.finn.api.video.VideoApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.video.bean.VideoReClassify;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.video.interfaces.VideoOtherCateContract;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/9 0009.
 */

public class VideoOtherCateListLogic implements VideoOtherCateContract.Model{
    @Override
    public Observable<List<VideoReClassify>> getModelVideoAllCate(Context context ,String  cid) {

        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoReCateList(ParamsMapUtils.getVideoOtherTwoColumn(cid))

//               进行预处理
                .compose(new DefaultTransformer<List<VideoReClassify>>());
    }
}
