package com.team.finn.base;


/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface CommonView {
    /**
     *  提示成功信息
     * @param msg
     */
    void showSuccessWithStatus(String msg);

    /**
     *  提示错误信息
     * @param msg
     */
    void showErrorWithStatus(String msg);

    /**
     *  提示消息
     * @param msg
     */
    void showsInfoWithStatus(String msg);
    /**
     *  进度框
     * @param msg
     */
    void showWithProgress(String msg);

    /**
     *
     */
    void dismiss();
}
