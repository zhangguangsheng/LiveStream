package com.team.finn.net.callback;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.utils.L;

import rx.Subscriber;

/**
 * 版本号：
 */

public abstract class ErrorSubscriber<T> extends Subscriber<T> {
    @Override
    public void onError(Throwable e) {
        if(e instanceof ResponeThrowable){
            onError((ResponeThrowable)e);
        }else{
            L.e("错误信息:"+e.getMessage());
            onError(new ResponeThrowable(e,1000));
        }
    }
    /**
     * 错误回调
     */
    protected abstract void onError(ResponeThrowable ex);
}

