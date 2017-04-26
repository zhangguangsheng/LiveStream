package com.team.finn.presenter.live.impl;


import com.team.finn.base.BasePresenter;
import com.team.finn.presenter.live.interfaces.LiveContract;
import com.team.finn.view.common.fragment.LiveFragment;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class LivePresenterImp extends BasePresenter<LiveFragment> implements LiveContract.Presenter {

    @Override
    public void message(String msg) {
        mView.showSuccessWithStatus(msg);
    }

    @Override
    public void allLiveList() {

}
}
