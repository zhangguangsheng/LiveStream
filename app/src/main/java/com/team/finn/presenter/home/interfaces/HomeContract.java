package com.team.finn.presenter.home.interfaces;


import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;

/**
 *  版本号：1.0
 *  备注消息：
 **/

public interface HomeContract {

      interface View extends BaseView {
           void getMessge(String msg);
      }

    interface  Model extends BaseModel{

    }

      abstract class Presenter extends BasePresenter<View,Model> {
          /**
           *  提示消息
           */
          public   abstract   void message(String msg);

          public  abstract  void columnDetail();
      }


}
