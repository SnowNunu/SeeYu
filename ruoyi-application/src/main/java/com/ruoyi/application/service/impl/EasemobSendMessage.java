package com.ruoyi.application.service.impl;

import com.ruoyi.application.Util.ResponseHandler;
import com.ruoyi.application.Util.EasemobAPI;
import com.ruoyi.application.Util.OrgInfo;
import com.ruoyi.application.Util.TokenUtil;
import com.ruoyi.application.service.SendMessageAPI;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessagesApi;
import io.swagger.client.model.Msg;

public class EasemobSendMessage implements SendMessageAPI {
    private ResponseHandler responseHandler = new ResponseHandler();
    private MessagesApi api = new MessagesApi();
    @Override
    public Object sendMessage(final Object payload) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameMessagesPost(OrgInfo.ORG_NAME,OrgInfo.APP_NAME, TokenUtil.getAccessToken(), (Msg) payload);
            }
        });
    }
}
