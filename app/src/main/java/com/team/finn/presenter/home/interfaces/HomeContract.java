package com.team.finn.presenter.home.interfaces;


import com.team.finn.base.BaseModel;
import com.team.finn.base.CommonPresenter;
import com.team.finn.base.CommonView;
import com.team.finn.model.annotation.Implement;
import com.team.finn.model.logic.home.HomeModelLogic;
import com.team.finn.presenter.home.impl.HomePresenterImp;

/**
 *  版本号：1.0
 *  备注消息：
 **/

public interface HomeContract {

      interface View extends CommonView {

      }

      @Implement(HomePresenterImp.class)
      interface Presenter extends CommonPresenter {
          /**
           *  提示消息
           */
          void message(String msg);
          void columnDetail();
      }

    @Implement(HomeModelLogic.class)
     interface  Model extends BaseModel{

     }







}
