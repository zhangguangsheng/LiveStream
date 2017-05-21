package com.team.finn.model.logic.live;

import android.content.Context;

import com.team.finn.api.live.LiveApi;
import com.team.finn.model.ParamsMapUtils;
import com.team.finn.model.logic.live.bean.LiveAllList;
import com.team.finn.model.logic.live.bean.LiveOtherList;
import com.team.finn.net.http.HttpUtils;
import com.team.finn.net.transformer.DefaultTransformer;
import com.team.finn.presenter.live.interfaces.LiveOtherColumnListContract;

import java.util.List;

import rx.Observable;

import static android.R.attr.offset;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class LiveOtherColumnListModelLogic implements LiveOtherColumnListContract.Model {
    /**
     * 获取全部视频
     *
     * @param context
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public Observable<List<LiveOtherList>> getModelLiveOtherColumnList(Context context, String cate_id, int offset, int limit) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(LiveApi.class)
                .getLiveOtherList(cate_id, ParamsMapUtils.getHomeFaceScoreColumn(offset, limit))
//               进行预处理
                .compose(new DefaultTransformer<List<LiveOtherList>>());
    }
}
