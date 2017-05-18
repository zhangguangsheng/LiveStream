package com.team.finn.view.home.fragment.recommend;

import android.os.Bundle;

import com.shizhefei.view.multitype.ItemBinderFactory;
import com.shizhefei.view.multitype.MultiTypeAdapter;
import com.shizhefei.view.multitype.MultiTypeView;
import com.shizhefei.view.multitype.provider.FragmentData;
import com.team.finn.R;
import com.team.finn.base.BaseFragment;
import com.team.finn.base.BaseView;
import com.team.finn.view.home.fragment.RecommendHomeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * 版本号：1.0
 * 备注消息：
 **/
public class RecommendFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    MultiTypeView recyclerView;
    private MultiTypeAdapter<Object> multiTypeAdapter;

    public static RecommendFragment getInstance() {
        RecommendFragment rf = new RecommendFragment();
        return rf;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        ItemBinderFactory factory = new ItemBinderFactory(getChildFragmentManager());
        multiTypeAdapter = new MultiTypeAdapter<>(loadData(), factory);
        recyclerView.setAdapter(multiTypeAdapter);

    }
    private List<Object> loadData() {
        List<Object> data = new ArrayList<>();
        data.add(new FragmentData(RecommendHomeFragment.class, "RecommendHomeFragment" ));
        return data;
    }

    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return null;
    }


    @Override
    protected void lazyFetchData() {

    }
}
