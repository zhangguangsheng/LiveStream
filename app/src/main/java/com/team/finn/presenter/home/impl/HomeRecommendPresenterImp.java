package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeRecommendContract;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeRecommendPresenterImp extends HomeRecommendContract.Presenter {

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
}
