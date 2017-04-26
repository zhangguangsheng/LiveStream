package com.team.finn.presenter.home.interfaces;


import com.team.finn.base.CommonPresenter;
import com.team.finn.base.CommonView;
import com.team.finn.model.annotation.Implement;
import com.team.finn.presenter.home.impl.HomePresenterImp;

/**
 *  版本号：1.0
 *  备注消息：
 **/
@Implement(HomePresenterImp.class)
public interface HomeContract {

      interface View extends CommonView {

      }
      interface Presenter extends CommonPresenter {

          /**
           *  提示消息
           */
          void message(String msg);

          void columnDetail();


      }
}
