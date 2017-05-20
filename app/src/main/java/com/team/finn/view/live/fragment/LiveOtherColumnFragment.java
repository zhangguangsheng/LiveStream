package com.team.finn.view.live.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.live.LiveOtherTwoColumnModelLogic;
import com.team.finn.model.logic.live.bean.LiveOtherColumn;
import com.team.finn.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.finn.presenter.live.impl.LiveOtherTwoColumnPresenterImp;
import com.team.finn.presenter.live.interfaces.LiveOtherTwoColumnContract;
import com.team.finn.view.live.adapter.LiveOtherTwoCloumnAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class LiveOtherColumnFragment extends BaseFragment<LiveOtherTwoColumnModelLogic, LiveOtherTwoColumnPresenterImp> implements LiveOtherTwoColumnContract.View {
    private static List<LiveOtherColumnFragment> mLiveOtherColumnFragment = new ArrayList<LiveOtherColumnFragment>();
    @BindView(R.id.twocolumn_tablayout)
    SlidingTabLayout twocolumnTablayout;
    @BindView(R.id.livetwocolumn_viewpager)
    ViewPager livetwocolumnViewpager;
    private LiveOtherColumn mLiveOtherColumn;
    private LiveOtherTwoCloumnAdapter mLiveOtherTwoColumnAdapter;
    private String[] mTilte;

    public static LiveOtherColumnFragment getInstance(LiveOtherColumn mLiveOtherColumn, int position) {
        LiveOtherColumnFragment rf = new LiveOtherColumnFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("mLiveOtherColumn", mLiveOtherColumn);
        bundle.putInt("position", position);
        mLiveOtherColumnFragment.add(position, rf);
        rf.setArguments(bundle);
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_othercolumn;
    }

    @Override
    protected void onInitView(Bundle bundle) {

    }
    @Override
    protected void onEvent() {

    }
    @Override
    protected BaseView getViewImp() {
        Bundle arguments = getArguments();
        return mLiveOtherColumnFragment.get(arguments.getInt("position"));
    }
    @Override
    protected void lazyFetchData() {
        Bundle arguments = getArguments();
        mLiveOtherColumn = (LiveOtherColumn) arguments.getSerializable("mLiveOtherColumn");
        mPresenter.getPresenterLiveOtherTwoColumn(mLiveOtherColumn.getShort_name());
    }

    @Override
    public void showErrorWithStatus(String msg) {

    }
    /**
     *  获取二级分类 栏目
     * @param mLiveOtherTwoCloumn
     */
    @Override
    public void getViewLiveOtherTwoColumn(List<LiveOtherTwoColumn> mLiveOtherTwoCloumn) {
        mTilte = new String[mLiveOtherTwoCloumn.size()];
        for (int i = 0; i < mLiveOtherTwoCloumn.size(); i++) {
            mTilte[i] = mLiveOtherTwoCloumn.get(i).getTag_name();
        }
        livetwocolumnViewpager.setOffscreenPageLimit(mTilte.length);
        mLiveOtherTwoColumnAdapter=new LiveOtherTwoCloumnAdapter(getChildFragmentManager(),mLiveOtherTwoCloumn,mTilte);
        livetwocolumnViewpager.setAdapter(mLiveOtherTwoColumnAdapter);
        mLiveOtherTwoColumnAdapter.notifyDataSetChanged();
        twocolumnTablayout.setViewPager(livetwocolumnViewpager,mTilte);
    }
}
