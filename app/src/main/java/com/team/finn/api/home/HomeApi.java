package com.team.finn.api.home;

import com.team.finn.api.NetWorkApi;
import com.team.finn.model.logic.home.HomeCate;
import com.team.finn.net.response.HttpResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface HomeApi {
    /**
     *  首页分类列表
     * @return
     */
    @GET(NetWorkApi.getHomeCate)
    Observable<HttpResponse<List<HomeCate>>> getHomeCate(@Query("identification") String identification);

}
