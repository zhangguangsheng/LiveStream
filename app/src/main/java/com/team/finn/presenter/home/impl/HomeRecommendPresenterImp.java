package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.model.logic.home.bean.HomeHotColumn;
import com.team.finn.model.logic.home.bean.HomeRecommendHotCate;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeRecommendContract;

import java.util.List;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class HomeRecommendPresenterImp extends HomeRecommendContract.Presenter {
    /**
     * 轮播图
     */
    @Override
    public void getPresenterCarousel() {
        addSubscribe(mModel.getModelCarousel(mContext).subscribe(new RxSubscriber<List<HomeCarousel>>() {
            @Override
            public void onSuccess(List<HomeCarousel> mHomeCarousel) {
                mView.getViewCarousel(mHomeCarousel);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
    /**
     * 最热栏目
     */
    @Override
    public void getPresenterHotColumn() {
        addSubscribe(mModel.getModelHotColumn(mContext).subscribe(new RxSubscriber<List<HomeHotColumn>>() {
            @Override
            public void onSuccess(List<HomeHotColumn> mHomeHotColumn) {
                mView.getViewHotColumn(mHomeHotColumn);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
    /**
     * 颜值 栏目
     */
    @Override
    public void getPresenterFaceScoreColumn(int offset,int limit  ) {
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
     * 热门栏目
     */
    @Override
    public void getPresenterHotCate() {
        addSubscribe(mModel.getModelHotCate(mContext).subscribe(new RxSubscriber<List<HomeRecommendHotCate>>() {
            @Override
            public void onSuccess(List<HomeRecommendHotCate> homeRecommendHotCates) {
                mView.getViewHotCate(homeRecommendHotCates);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
