package com.team.finn.base;
/**
 *  版本号：1.0
 *         1.获取绑定View实例传递到子类中进行调用!
 *
 *         2.注销View实例
 *
 *  备注消息：
 **/
public class BasePresenter<T extends  BaseView> implements Presenter<T> {

    protected T mView;

//    获取绑定View实例
    @Override
    public void attachView(T view) {
          this.mView=view;
    }
//    注销View实例
    @Override
    public void detachView() {
         this.mView=null;
    }

    public T getView() {
        return mView;
    }

    public boolean isViewBind()
    {
        return mView!=null;
    }

}
