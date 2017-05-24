package com.team.finn.model.logic.common;

import android.content.Context;

import com.team.finn.api.NetWorkApi;
import com.team.finn.presenter.common.interfaces.CommonPcLiveVideoContract;
import com.team.finn.presenter.common.interfaces.CommonPhoneLiveVideoContract;
import com.team.finn.utils.MD5Util;

import okhttp3.Request;


/**
 * 版本号：1.0
 * 备注消息：
 **/
public class CommonPhoneLiveVideoModelLogic implements CommonPhoneLiveVideoContract.Model {

    @Override
    public Request getModelPhoneLiveVideoInfo(Context context, String room_id) {
        /**
         * 房间加密处理
         */
        int time = (int)(System.currentTimeMillis() / 1000) ;
        String str = "lapi/live/thirdPart/getPlay/" + room_id + "?aid=pcclient&rate=0&time=" + time + "9TUk5fjjUjg9qIMH3sdnh";
        String auth = MD5Util.getToMd5Low32(str);
//        L.e("地址为:"+NetWorkApi.baseUrl + NetWorkApi.getLiveVideo + room_id+"?"+tempParams.toString());
        Request requestPost = new Request.Builder()
                .url(NetWorkApi.oldBaseUrl+ NetWorkApi.getOldLiveVideo+ room_id + "?rate=0")
                .get()
                .addHeader("aid","pcclient")
                .addHeader("auth",auth)
                .addHeader("time",time+"")
                .build();
        return requestPost;
    }
}
