package com.team.finn.presenter.live.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.model.logic.live.bean.LiveOtherList;

import java.util.List;

import rx.Observable;

import static android.R.attr.offset;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface LiveOtherColumnListContract {
      interface View extends BaseView {
          void getViewLiveOtherColumnList(List<LiveOtherList> mLiveAllList);
          void getViewLiveOtherColumnListLoadMore(List<LiveOtherList> mLiveAllList);
      }
      interface Model extends BaseModel {
            Observable<List<LiveOtherList>> getModelLiveOtherColumnList(Context context,String cate_id,int offset, int limit);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
          //          刷新数据
          public abstract void getPresenterLiveOtherColumnList(String cate_id,int offset,int limit );
          //          加载更多
          public abstract  void  getPresenterLiveOtherColumnListLoadMore(String cate_id,int offset,int limit);

      }

}
