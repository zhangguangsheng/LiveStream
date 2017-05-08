package com.team.finn.presenter.live.interfaces;


import com.team.finn.base.BaseView;
import com.team.finn.base.CommonPresenter;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveContract {
      interface View extends BaseView {

      }
      interface Presenter extends CommonPresenter {

            /**
             *  提示消息
             */
            void message(String msg);

            void allLiveList();

      }
}
