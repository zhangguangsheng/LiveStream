package com.team.finn.presenter.live.interfaces;


import android.content.Context;
import android.view.View;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.base.CommonPresenter;
import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.model.logic.home.bean.HomeHotColumn;
import com.team.finn.model.logic.home.bean.HomeRecommendHotCate;
import com.team.finn.model.logic.live.bean.LiveOtherColumn;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveOtherColumnContract {
      interface View extends BaseView {
         void   getViewLiveOtherColumn(List<LiveOtherColumn> mLiveOtherColumns);
      }
      interface Model extends BaseModel {
            Observable<List<LiveOtherColumn>> getModelLiveOtherColumn(Context context);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
//            获取直播其他栏目分类
            public abstract void  getPresenterLiveOtherColumn();

      }

}
