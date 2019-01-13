package com.ruoyi.common.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ruoyi.common.enums.ServiceStaus;

/**
 * app客户端response
 *
 * @author trc
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class JsonResult {

    // 响应码
    private int code;

    // 响应消息
    private String msg;

    // 响应内容
    private Object data;

    public JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(ServiceStaus serviceStaus) {
        this.code = serviceStaus.getCode();
        this.msg = serviceStaus.getMsg();
    }

    public JsonResult(ServiceStaus serviceStaus, Object data) {
        this.code = serviceStaus.getCode();
        this.msg = serviceStaus.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
