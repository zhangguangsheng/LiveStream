package com.team.finn.view.live.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.presenter.live.impl.LivePresenterImp;
import com.team.finn.presenter.live.interfaces.LiveContract;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class LiveFragment extends BaseFragment implements LiveContract.View {

    SVProgressHUD svProgressHUD;
    @BindView(R.id.btn_live)
    Button btnLive;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        svProgressHUD = new SVProgressHUD(getActivity());

    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }


    @OnClick(R.id.btn_live)
    public void home()
    {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    protected void lazyFetchData() {

    }

    @Override
    public void showErrorWithStatus(String msg) {

    }
}
