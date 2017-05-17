package com.team.finn.model.logic.home;

import android.content.Context;

import com.team.finn.api.home.HomeApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.home.bean.HomeCate;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.home.interfaces.HomeCateContract;

import java.util.List;

import rx.Observable;

/**
 * 版本号：
 */

public class HomeCateModelLogic  implements HomeCateContract.Model {

    @Override
    public Observable<List<HomeCate>> getHomeCate(Context context, String identification) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getHomeCate(ParamsMapUtils.getHomeCate(identification))
//               进行预处理
                .compose(new DefaultTransformer<List<HomeCate>>());
    }
}
