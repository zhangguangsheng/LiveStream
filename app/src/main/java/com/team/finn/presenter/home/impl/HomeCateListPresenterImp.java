package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeCateList;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeCateListContract;
import com.team.finn.utils.L;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeCateListPresenterImp extends HomeCateListContract.Presenter {

    @Override
    public void getHomeCateList() {
             addSubscribe(mModel.getHomeCateList(mContext).subscribe(new RxSubscriber<List<HomeCateList>>() {
                 @Override
                 public void onSuccess(List<HomeCateList> homeCateListList) {
                    mView.getHomeAllList(homeCateListList);
                 }
                 @Override
                 protected void onError(ResponeThrowable ex) {
                   mView.showErrorWithStatus(ex.message);
                 }
             }));
    }
}
