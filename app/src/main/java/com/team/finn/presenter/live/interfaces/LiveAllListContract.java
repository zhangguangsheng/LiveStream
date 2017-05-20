package com.team.finn.presenter.live.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.live.bean.LiveAllList;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveAllListContract {
      interface View extends BaseView {
          //        颜值栏目
          void getViewLiveAllListColumn(List<LiveAllList> mLiveAllList);
          void getViewLiveAllListLoadMore(List<LiveAllList> mLiveAllList);
      }
      interface Model extends BaseModel {
            Observable<List<LiveAllList>> getModelLiveAllList(Context context,int offset,int limit);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
          //          刷新数据
          public abstract void getPresenterListAllList(int offset,int limit );
          //          加载更多
          public abstract  void  getPresenterListAllListLoadMore(int offset,int limit);

      }

}
