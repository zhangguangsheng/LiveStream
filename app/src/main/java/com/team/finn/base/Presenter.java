package com.team.finn.base;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface Presenter<View,Model> {
    //    绑定View控件
    void attachView(View view);
    //    绑定Model
    void attachModel(Model model);
    //    注销View控件
    void detachView();
    //    注销Model对象
    void detachModel();

}
