package com.team.finn.net.response;

import static android.R.id.message;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HttpResponse<T> {


     private String error ;

    private T data;


    public String getError() {
        return error;
    }

    public void setError(String error) {
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
