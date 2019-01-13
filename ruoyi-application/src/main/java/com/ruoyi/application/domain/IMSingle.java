package com.ruoyi.application.domain;

public class IMSingle {

    // 公司ID
    public static final String orgName = "1177170805178930";

    // appId
    public static final String appId = "seeyu";

    // client_id
    public static final String client_id = "YXA6cEnisBVTEemmqsPSohigvA";

    // client_secret
    public static final String client_secret = "YXA68y2VnrkKkjP1Dy79OEKNOPwwQY4";

    // 有效的token字符串
    private String access_token;

    // token 有效时间，以秒为单位，在有效期内不需要重复获取
    private String expires_in;

    // 当前 App 的 UUID 值
    private String application;

    private static volatile IMSingle instance;

    private IMSingle() {
    }

    // 单例模式
    public static IMSingle getInstance() {
        if (instance == null) {
            synchronized (IMSingle.class) {
                if (instance == null) {
                    instance = new IMSingle();
                }
            }
        }
        return instance;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
