package com.team.finn.api.common;

import com.team.finn.model.logic.common.bean.LiveVideoInfo;
import com.team.finn.net.response.HttpResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import static com.team.finn.api.NetWorkApi.getLiveVideo;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface CommonApi {
    /**
     *  直播播放页
     * @return
     */
    @GET(getLiveVideo+"{room_id}")
    Call<HttpResponse<LiveVideoInfo>> getLiveVideoInfo(@Path("room_id") String room_id, @QueryMap Map<String,String> params);

}
