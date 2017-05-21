package com.team.finn.presenter.video.impl;


import com.team.finn.model.logic.video.bean.VideoOtherColumnList;
import com.team.finn.model.logic.video.bean.VideoReClassify;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.video.interfaces.VideoOtherTwoColumnContract;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class VideoOtherTwoColumnPresenterImp extends VideoOtherTwoColumnContract.Presenter {

//    @Override
//    public void getPresenterLiveOtherTwoColumn(String mCloumnName) {
//        addSubscribe(mModel.getModelLiveOtherTwoColumn(mContext,mCloumnName).subscribe(new RxSubscriber<List<LiveOtherTwoColumn>>() {
//            @Override
//            public void onSuccess(List<LiveOtherTwoColumn> mLiveOtherTwoColumns) {
//                mView.getViewLiveOtherTwoColumn(mLiveOtherTwoColumns);
//            }
//            @Override
//            protected void onError(ResponeThrowable ex) {
//                mView.showErrorWithStatus(ex.message);
//            }
//        }));
//    }

    @Override
    public void getPresenterVideoOtherTwoColumn(String  cid1,String cid2,int offset,int limit,String action ) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewOtherTwoColumn(videoReClassifies);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));

    }

    @Override
    public void getPresenterLiveOtherColumnList(String cid1, String cid2, int offset, int limit, String action) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewOtherTwoColumn(videoReClassifies);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterLiveOtherColumnListLoadMore(String cid1, String cid2, int offset, int limit, String action) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewVideoOtherColumnListLoadMore(videoReClassifies);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
