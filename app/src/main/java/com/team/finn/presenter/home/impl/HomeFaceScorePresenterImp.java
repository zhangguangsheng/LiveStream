package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeFaceScoreContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeFaceScorePresenterImp extends HomeFaceScoreContract.Presenter {
    /**
     *   刷新数据
     * @param offset
     * @param limit
     */
    @Override
    public void getPresenterFaceScoreColumn(int offset, int limit) {
        addSubscribe(mModel.getModelFaceScoreColumn(mContext,offset,limit).subscribe(new RxSubscriber<List<HomeFaceScoreColumn>>() {
            @Override
            public void onSuccess(List<HomeFaceScoreColumn> homeFaceScoreColumns) {
                mView.getViewFaceScoreColumn(homeFaceScoreColumns);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    /**
     *  加载更多
     * @param offset
     * @param limit
     */
    @Override
    public void getPresenterFaceScoreLoadMore(int offset, int limit) {
        addSubscribe(mModel.getModelFaceScoreColumn(mContext,offset,limit).subscribe(new RxSubscriber<List<HomeFaceScoreColumn>>() {
            @Override
            public void onSuccess(List<HomeFaceScoreColumn> homeFaceScoreColumns) {
                mView.getViewFaceScoreColumnLoadMore(homeFaceScoreColumns);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
