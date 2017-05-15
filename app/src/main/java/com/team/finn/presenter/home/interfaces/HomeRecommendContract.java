package com.team.finn.presenter.home.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.home.bean.HomeCarousel;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface HomeRecommendContract {
    interface View extends BaseView {
//        轮播图
        void getViewCarousel(List<HomeCarousel> mHomeCarousel);
    }
    interface  Model extends BaseModel {
        Observable<List<HomeCarousel>> getModelCarousel(Context context);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
            public abstract  void  getPresenterCarousel();
    }
}
