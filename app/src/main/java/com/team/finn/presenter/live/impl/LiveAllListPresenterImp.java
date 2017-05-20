package com.team.finn.presenter.live.impl;

import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.model.logic.live.bean.LiveOtherColumn;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.live.interfaces.LiveAllListContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveAllListPresenterImp extends LiveAllListContract.Presenter {
//     刷新数据
    @Override
    public void getPresenterListAllList(int offset, int limit) {
        addSubscribe(mModel.getModelLiveAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveAllList>>() {
            @Override
            public void onSuccess(List<LiveAllList> mLiveAllList) {
                mView.getViewLiveAllListColumn(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
//加载更多
    @Override
    public void getPresenterListAllListLoadMore(int offset, int limit) {
        addSubscribe(mModel.getModelLiveAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveAllList>>() {
            @Override
            public void onSuccess(List<LiveAllList> mLiveAllList) {
                mView.getViewLiveAllListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
