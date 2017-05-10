package com.team.finn.net.transformer;


import com.team.finn.net.response.HttpResponse;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class DefaultTransformer<T>  implements Observable.Transformer<HttpResponse<T>,T>{
    @Override
    public Observable<T> call(Observable<HttpResponse<T>> httpResponseObservable) {

        return httpResponseObservable. subscribeOn(Schedulers.io())
                                                .observeOn(Schedulers.newThread())
                                                .compose(ErrorTransformer.<T>getInstance())
                                                .observeOn(AndroidSchedulers.mainThread());
    }
}
