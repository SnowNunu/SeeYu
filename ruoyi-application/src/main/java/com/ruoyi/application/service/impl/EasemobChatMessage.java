package com.ruoyi.application.service.impl;


import com.ruoyi.application.Util.EasemobAPI;
import com.ruoyi.application.Util.OrgInfo;
import com.ruoyi.application.Util.TokenUtil;
import com.ruoyi.application.service.ChatMessageAPI;
import io.swagger.client.ApiException;
import io.swagger.client.api.ChatHistoryApi;
import com.ruoyi.application.Util.ResponseHandler;


public class EasemobChatMessage  implements ChatMessageAPI {

    private ResponseHandler responseHandler = new ResponseHandler();
    private ChatHistoryApi api = new ChatHistoryApi();

    @Override
    public Object exportChatMessages(final Long limit,final String cursor,final String query) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameChatmessagesGet(OrgInfo.ORG_NAME,OrgInfo.APP_NAME, TokenUtil.getAccessToken(),query,limit+"",cursor);
            }
        });
    }

    @Override
    public Object exportChatMessages(final String timeStr) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameChatmessagesTimeGet(OrgInfo.ORG_NAME,OrgInfo.APP_NAME,TokenUtil.getAccessToken(),timeStr);
            }
        });
    }
}
