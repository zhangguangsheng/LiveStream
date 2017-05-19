package com.team.finn.presenter.home.interfaces;


import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface HomeFaceScoreLiveVideoContract {
      interface View extends BaseView {

      }
    interface  Model extends BaseModel{
    }
      abstract class Presenter extends BasePresenter<View,Model> {


      }

}
