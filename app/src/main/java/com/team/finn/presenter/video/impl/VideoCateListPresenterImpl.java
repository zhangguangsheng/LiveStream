package com.team.finn.presenter.video.impl;


import com.team.finn.model.logic.video.bean.VideoCateList;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.video.interfaces.VideoAllCateListContract;

import java.util.List;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class VideoCateListPresenterImpl extends VideoAllCateListContract.Presenter {

    @Override
    public void getPresenterVideoCatelist() {
        addSubscribe(mModel.getModelVideoAllCate(mContext).subscribe(new RxSubscriber<List<VideoCateList>>() {
            @Override
            public void onSuccess(List<VideoCateList> mVideoCateList) {
                mView.getViewVideoAllCate(mVideoCateList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
