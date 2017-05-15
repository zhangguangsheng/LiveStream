package com.team.finn.view.home.fragment;

import android.os.Bundle;

import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.home.bean.HomeCate;
import com.team.finn.model.logic.home.bean.HomeCateList;
import com.team.finn.model.logic.home.HomeCateModelLogic;
import com.team.finn.presenter.home.impl.HomeCatePresenterImp;
import com.team.finn.presenter.home.interfaces.HomeCateContract;
import com.team.finn.utils.L;

import java.util.List;


/**
 *  版本号：1.0
 *  备注消息：首页 列表页  显示 手游,娱乐,游戏,趣玩等!
 **/
public class OtherHomeFragment extends BaseFragment<HomeCateModelLogic,HomeCatePresenterImp> implements HomeCateContract.View {

  private  HomeCateList mHomeCate;
    public static OtherHomeFragment getInstance(Bundle args) {
        OtherHomeFragment sf = new OtherHomeFragment();
        sf.setArguments(args);
        return sf;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live;
    }
    @Override
    protected void onInitView(Bundle bundle) {
        Bundle arguments = getArguments();
        mHomeCate=(HomeCateList)arguments.getSerializable("homecatelist");
        L.i("信息为ID:"+mHomeCate.getIdentification());
        mPresenter.getHomeCate(mHomeCate.getIdentification());
    }
    @Override
    protected void onEvent() {

    }
    @Override
    protected BaseView getViewImp() {
        return this;
    }
    @Override
    public void getOtherList(List<HomeCate> homeCates) {

//        L.i("获取到的数据为:"+homeCates.toString());
    }
}
