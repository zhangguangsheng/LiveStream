package com.team.finn.presenter.live.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.live.bean.LiveOtherTwoColumn;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveOtherTwoColumnContract {
      interface View extends BaseView {

            void getViewLiveOtherTwoColumn(List<LiveOtherTwoColumn> mLiveOtherTwoCloumn);
      }
      interface Model extends BaseModel {
            Observable<List<LiveOtherTwoColumn>> getModelLiveOtherTwoColumn(Context context, String mCloumnName);
      }
      abstract class Presenter extends BasePresenter<View,Model> {

            public  abstract void getPresenterLiveOtherTwoColumn(String mCloumnName);

      }

}
