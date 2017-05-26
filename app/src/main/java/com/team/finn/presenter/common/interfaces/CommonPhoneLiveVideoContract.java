package com.team.finn.presenter.common.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.common.bean.OldLiveVideoInfo;

import okhttp3.Request;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface CommonPhoneLiveVideoContract {

      interface View extends BaseView {
           void getViewPhoneLiveVideoInfo(OldLiveVideoInfo mLiveVideoInfo);
      }
    interface  Model extends BaseModel{
        Request getModelPhoneLiveVideoInfo(Context context, String room_id);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
              public abstract  void getPresenterPhoneLiveVideoInfo(String room_id);
      }

}
