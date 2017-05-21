package com.team.finn.presenter.live.impl;

import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.model.logic.live.bean.LiveSportsAllList;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.live.interfaces.LiveAllListContract;
import com.team.finn.presenter.live.interfaces.LiveSportsColumnAllListContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveSportsColumnAllListPresenterImp extends LiveSportsColumnAllListContract.Presenter {
//     刷新数据
    @Override
    public void getPresenterLiveSportsColumnAllList(int offset, int limit) {
        addSubscribe(mModel.getModelLiveSportsColumnAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveSportsAllList>>() {
            @Override
            public void onSuccess(List<LiveSportsAllList> mLiveAllList) {
                mView.getViewLiveSportsColumnAllListColumn(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
//加载更多
    @Override
    public void getPresenterLiveSportsColumnAllListLoadMore(int offset, int limit) {
        addSubscribe(mModel.getModelLiveSportsColumnAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveSportsAllList>>() {
            @Override
            public void onSuccess(List<LiveSportsAllList> mLiveAllList) {
                mView.getViewLiveSportsColumnAllListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
