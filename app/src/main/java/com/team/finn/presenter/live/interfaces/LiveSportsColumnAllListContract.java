package com.team.finn.presenter.live.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.model.logic.live.bean.LiveSportsAllList;

import java.util.List;

import rx.Observable;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveSportsColumnAllListContract {
      interface View extends BaseView {
          void getViewLiveSportsColumnAllListColumn(List<LiveSportsAllList> mLiveAllList);
          void getViewLiveSportsColumnAllListLoadMore(List<LiveSportsAllList> mLiveAllList);
      }
      interface Model extends BaseModel {
            Observable<List<LiveSportsAllList>> getModelLiveSportsColumnAllList(Context context, int offset, int limit);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
          //          刷新数据
          public abstract void getPresenterLiveSportsColumnAllList(int offset,int limit );
          //          加载更多
          public abstract  void  getPresenterLiveSportsColumnAllListLoadMore(int offset,int limit);

      }

}
