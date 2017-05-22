package com.team.finn.model.logic.common;

import android.content.Context;

import com.team.finn.api.NetWorkApi;
import com.team.finn.presenter.common.interfaces.CommonPhoneLiveVideoContract;
import com.team.finn.utils.L;
import com.team.finn.utils.MD5Util;

import java.util.UUID;

import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;


/**
 * 版本号：1.0
 * 备注消息：
 **/
public class CommonLiveVideoModelLogic implements CommonPhoneLiveVideoContract.Model {

    @Override
    public Request getModelPhoneLiveVideoInfo(Context context, String room_id) {
        long time = System.currentTimeMillis() / (1000 * 60);
        String did = UUID.randomUUID().toString().toUpperCase();
        did = did.replace("-", "");
        String str = room_id + did + "A12Svb&%1UUmf@hC" + time;
        String sign = MD5Util.getToMd5Low32(str);
        RequestBody requestBodyPost = new FormBody.Builder()
                .add("cdn", "ws")
                .add("rate", "0")
                .add("tt", String.valueOf(time))
                .add("did", did)
                .add("sign", sign)
                .build();
        Request requestPost = new Request.Builder()
                .url(NetWorkApi.baseUrl+NetWorkApi.getLiveVideo+room_id)
                .post(requestBodyPost)
                .build();
        L.e("tt:"+String.valueOf(time));
        L.e("did:"+did);
        L.e("sign:"+sign);
        L.e("Url:"+NetWorkApi.baseUrl+NetWorkApi.getLiveVideo+room_id);
        return requestPost;
    }
}
