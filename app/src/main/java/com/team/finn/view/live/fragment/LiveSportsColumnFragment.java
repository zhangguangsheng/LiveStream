package com.team.finn.view.live.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.ui.refreshview.XRefreshView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 版本号：
 */

public class LiveSportsColumnFragment extends BaseFragment {

    /**
     *  分页加载
     */
//    起始位置
    private  int offset = 0;
    //    每页加载数量
    private  int limit = 20;
    @BindView(R.id.livesports_content_recyclerview)
    RecyclerView livesportsContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;

    public static LiveSportsColumnFragment getInstance() {
        LiveSportsColumnFragment rf = new LiveSportsColumnFragment();
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_sports;
    }

    @Override
    protected void onInitView(Bundle bundle) {

    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return null;
    }

    @Override
    protected void lazyFetchData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
