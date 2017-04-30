package com.team.finn.presenter.home.impl;


import com.team.finn.base.BasePresenter;
import com.team.finn.model.logic.home.HomeModelLogic;
import com.team.finn.presenter.home.interfaces.HomeContract;
import com.team.finn.view.home.fragment.HomeFragment;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomePresenterImp extends BasePresenter<HomeFragment,HomeModelLogic> implements HomeContract.Presenter {
    @Override
    public void message(String msg) {
        mView.showSuccessWithStatus(msg);
    }
    @Override
    public void columnDetail() {

    }


}
