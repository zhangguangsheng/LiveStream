package com.team.finn.presenter.live.impl;


import com.team.finn.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.live.interfaces.LiveOtherTwoColumnContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherTwoColumnPresenterImp extends LiveOtherTwoColumnContract.Presenter {

    @Override
    public void getPresenterLiveOtherTwoColumn(String mCloumnName) {
        addSubscribe(mModel.getModelLiveOtherTwoColumn(mContext,mCloumnName).subscribe(new RxSubscriber<List<LiveOtherTwoColumn>>() {
            @Override
            public void onSuccess(List<LiveOtherTwoColumn> mLiveOtherTwoColumns) {
                mView.getViewLiveOtherTwoColumn(mLiveOtherTwoColumns);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
