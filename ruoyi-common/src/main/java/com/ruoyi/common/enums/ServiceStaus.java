package com.ruoyi.common.enums;


/**
 * 服务器
 *
 * @author trc
 * @date 2019-01-11
 */
public enum ServiceStaus {

    REQUEST_OK(0,"请求成功"),
    REQUEST_REGISTER_OK(0,"注册成功"),

    /*------------------------------*/
    REQUEST_PARAMS_LOSS(1,"缺少请求参数"),
    REQUEST_REGISTER_FAIL(2,"注册失败");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ServiceStaus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
