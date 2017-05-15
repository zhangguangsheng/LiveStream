package com.team.finn.presenter.home.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.home.HomeCateList;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface HomeCateListContract {
    interface View extends BaseView {
       void getOtherList(List<HomeCateList> cateLists);
    }
    interface  Model extends BaseModel {
        Observable getHomeCateList(Context context);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void  getHomeCateList();
    }
}
