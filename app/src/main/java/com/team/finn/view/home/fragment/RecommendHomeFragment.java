package com.team.finn.view.home.fragment;

import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.home.HomeRecommendModelLogic;
import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.presenter.home.impl.HomeRecommendPresenterImp;
import com.team.finn.presenter.home.interfaces.HomeRecommendContract;
import com.team.finn.utils.L;
import com.team.finn.view.home.adapter.HomeCarouselAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.bingoogolapple.bgabanner.BGABanner;


/**
 *  版本号：1.0
 *  备注消息：
 **/
public class RecommendHomeFragment  extends BaseFragment<HomeRecommendModelLogic,HomeRecommendPresenterImp> implements HomeRecommendContract.View
        ,BGABanner.Delegate<SimpleDraweeView, String>{
    @BindView(R.id.recommed_banner)
    BGABanner recommed_banner;
    HomeCarouselAdapter adapter;
    public static RecommendHomeFragment getInstance() {
        RecommendHomeFragment rf= new RecommendHomeFragment();
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_recommend;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        adapter=new HomeCarouselAdapter();
       mPresenter.getPresenterCarousel();

    }
    @Override
    protected void onEvent() {
        recommed_banner.setDelegate(this);
    }
    @Override
    protected BaseView getViewImp() {
        return this;
    }

    /**
     *  轮播图
     * @param mHomeCarousel
     */
    @Override
    public void getViewCarousel(List<HomeCarousel> mHomeCarousel) {
        ArrayList<String> pic_url=new ArrayList<String>();
//        ArrayList<String>  title=new ArrayList<String>();
        for(int i=0;i<mHomeCarousel.size();i++)
        {
            pic_url.add(mHomeCarousel.get(i).getPic_url());
//            title.add(mHomeCarousel.get(i).getTitle());
        }
        recommed_banner.setAdapter(adapter);
        recommed_banner.setData(R.layout.item_image_carousel,pic_url,null);
    }
    @Override
    public void onBannerItemClick(BGABanner banner, SimpleDraweeView itemView, String model, int position) {

    }
}
