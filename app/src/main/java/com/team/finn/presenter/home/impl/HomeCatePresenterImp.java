package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.bean.HomeCate;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeCateContract;
import com.team.finn.utils.L;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeCatePresenterImp extends HomeCateContract.Presenter {

    @Override
    public void getHomeCate(String identification) {
             addSubscribe(mModel.getHomeCate(mContext,identification).subscribe(new RxSubscriber<List<HomeCate>>() {
                 @Override
                 public void onSuccess(List<HomeCate> homeCates) {
                    mView.getOtherList(homeCates);
                 }
                 @Override
                 protected void onError(ResponeThrowable ex) {
                   L.i(ex.message+""+ex.code+"");
                 }
             }));
    }
}
