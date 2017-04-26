package com.team.finn.base;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface Presenter<View> {
//    绑定View控件
    void attachView(View view);
//    注销View控件
    void detachView();

}
