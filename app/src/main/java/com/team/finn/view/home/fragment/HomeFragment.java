package com.team.finn.view.home.fragment;

import android.os.Bundle;
import android.widget.Button;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.home.HomeCateModelLogic;
import com.team.finn.model.logic.home.HomeModelLogic;
import com.team.finn.presenter.home.impl.HomeCatePresenterImp;
import com.team.finn.presenter.home.impl.HomePresenterImp;
import com.team.finn.presenter.home.interfaces.HomeCateContract;
import com.team.finn.presenter.home.interfaces.HomeContract;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class HomeFragment extends BaseFragment<HomeCateModelLogic,HomeCatePresenterImp> implements HomeCateContract.View{
    @BindView(R.id.btn_home)
    Button btnHome;
    SVProgressHUD svProgressHUD;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void onInitView(Bundle bundle) {
      svProgressHUD=new SVProgressHUD(getActivity());

    }
    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    @OnClick(R.id.btn_home)
    public void home()
    {
//        正常数据
     mPresenter.getHomeCate("3e760da75be261a588c74c4830632360");
//        错误数据
        mPresenter.getHomeCate("3e760da75be261a588c74c483063236");
    }

}
