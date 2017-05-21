package com.team.finn.presenter.video.interfaces;

import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.video.bean.VideoCateList;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public interface VideoAllCateListContract {
    interface  View extends BaseView{
        void getViewVideoAllCate(List<VideoCateList> cateLists);
    }
    interface Model extends BaseModel{
        Observable<List<VideoCateList>> getModelVideoAllCate(Context context);

    }
    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void  getPresenterVideoCatelist();
    }
}
