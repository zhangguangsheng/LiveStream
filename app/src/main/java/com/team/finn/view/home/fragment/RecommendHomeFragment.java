package com.team.finn.view.home.fragment;

import android.os.Bundle;

import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;

import static com.team.finn.R.layout.fragment_home_recommend;
import static com.team.finn.R.layout.fragment_live;

/**
 * 版本号：
 */

public class RecommendHomeFragment  extends BaseFragment{

    public static RecommendHomeFragment getInstance() {
        RecommendHomeFragment rf= new RecommendHomeFragment();
        return rf;
    }
    @Override
    protected int getLayoutId() {
        return fragment_home_recommend;
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
}
