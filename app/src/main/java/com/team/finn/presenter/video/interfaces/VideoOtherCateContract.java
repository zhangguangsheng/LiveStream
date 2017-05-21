package com.team.finn.presenter.video.interfaces;

import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.video.bean.VideoReClassify;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public interface VideoOtherCateContract {
    interface  View extends BaseView{
        void getViewVideoOtherCate(List<VideoReClassify> cateLists);
    }
    interface Model extends BaseModel{
        Observable<List<VideoReClassify>> getModelVideoAllCate(Context context,String cId);
    }

    abstract class Presenter extends BasePresenter<VideoOtherCateContract.View, VideoOtherCateContract.Model> {

        public abstract void getPresenterVideoOtherCate(String  cid);

    }
}
