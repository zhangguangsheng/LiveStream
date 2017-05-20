package com.team.finn.presenter.live.impl;


import com.team.finn.model.logic.live.bean.LiveOtherColumn;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.live.interfaces.LiveOtherColumnContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherColumnPresenterImp extends LiveOtherColumnContract.Presenter {

    @Override
    public void getPresenterLiveOtherColumn() {
        addSubscribe(mModel.getModelLiveOtherColumn(mContext).subscribe(new RxSubscriber<List<LiveOtherColumn>>() {
            @Override
            public void onSuccess(List<LiveOtherColumn> mLiveOtherColumns) {
                mView.getViewLiveOtherColumn(mLiveOtherColumns);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
