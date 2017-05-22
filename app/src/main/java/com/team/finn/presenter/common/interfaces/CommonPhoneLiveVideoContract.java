package com.team.finn.presenter.common.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.common.bean.LiveVideoInfo;
import com.team.finn.net.response.HttpResponse;

import okhttp3.Request;
import retrofit2.Call;
import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface CommonPhoneLiveVideoContract {

      interface View extends BaseView {
           void getViewPhoneLiveVideoInfo(LiveVideoInfo mLiveVideoInfo);
      }
    interface  Model extends BaseModel{
        Request getModelPhoneLiveVideoInfo(Context context, String room_id);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
              public abstract  void getPresenterPhoneLiveVideoInfo(String room_id);
      }

}
