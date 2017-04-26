package com.team.finn.presenter.live.interfaces;


import com.team.finn.base.CommonPresenter;
import com.team.finn.base.CommonView;
import com.team.finn.model.annotation.Implement;
import com.team.finn.presenter.live.impl.LivePresenterImp;

/**
 *  版本号：1.0
 *  备注消息：
 **/
@Implement(LivePresenterImp.class)
public interface LiveContract {
      interface View extends CommonView {

      }
      interface Presenter extends CommonPresenter {

            /**
             *  提示消息
             */
            void message(String msg);

            void allLiveList();

      }
}
