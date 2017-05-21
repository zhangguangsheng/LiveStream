package com.team.finn.presenter.live.impl;

import com.team.finn.model.logic.live.bean.LiveOtherList;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.live.interfaces.LiveOtherColumnListContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LiveOtherColumnListPresenterImp extends LiveOtherColumnListContract.Presenter {
//     刷新数据
    @Override
    public void getPresenterLiveOtherColumnList(String cate_id,int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveOtherColumnList(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
//加载更多
    @Override
    public void getPresenterLiveOtherColumnListLoadMore(String cate_id,int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveOtherColumnListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
    /**
     *  颜值 列表
     */

    @Override
    public void getPresenterLiveFaceScoreColumnList(String cate_id, int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveFaceScoreColumnList(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterLiveFaceScoreColumnListLoadMore(String cate_id, int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveFaceScoreColumnListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }



}
