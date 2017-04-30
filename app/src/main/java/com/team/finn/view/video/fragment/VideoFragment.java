package com.team.finn.view.video.fragment;

import android.os.Bundle;
import android.widget.Button;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class VideoFragment extends BaseFragment {
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
    protected Class getPresenterClazz() {
        return null;
    }

    @Override
    protected Class getModelClazz() {
        return null;
    }

    @OnClick(R.id.btn_home)
    public void home()
    {


    }
}
