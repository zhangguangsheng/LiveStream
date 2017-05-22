package com.team.finn.net.response;

import static android.R.id.message;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HttpResponse<T> {


     private int error ;

    private T data;


    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "{" +
                "error:'" + error + '\'' +
                ", data:" + data +
                '}';
    }
}
