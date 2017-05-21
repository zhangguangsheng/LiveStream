package com.team.finn.model.logic.video;

import android.content.Context;

import com.team.finn.api.video.VideoApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.video.bean.VideoCateList;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.video.interfaces.VideoAllCateListContract;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class VideoCateListLogic implements VideoAllCateListContract.Model {
    @Override
    public Observable<List<VideoCateList>> getModelVideoAllCate(Context context) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoCateList(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<VideoCateList>>());

    }
}
