package com.ruoyi.application.service.impl;


import com.ruoyi.application.Util.EasemobAPI;
import com.ruoyi.application.Util.OrgInfo;
import com.ruoyi.application.Util.TokenUtil;
import com.ruoyi.application.service.FileAPI;
import io.swagger.client.ApiException;
import io.swagger.client.api.UploadAndDownloadFilesApi;
import com.ruoyi.application.Util.ResponseHandler;

import java.io.File;


public class EasemobFile implements FileAPI {
    private ResponseHandler responseHandler = new ResponseHandler();
    private UploadAndDownloadFilesApi api = new UploadAndDownloadFilesApi();
    @Override
    public Object uploadFile(final Object file) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameChatfilesPost(OrgInfo.ORG_NAME,OrgInfo.APP_NAME, TokenUtil.getAccessToken(),(File)file,true);
             }
        });
    }

    @Override
    public Object downloadFile(final String fileUUID,final  String shareSecret,final Boolean isThumbnail) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
               return api.orgNameAppNameChatfilesUuidGet(OrgInfo.ORG_NAME,OrgInfo.APP_NAME,TokenUtil.getAccessToken(),fileUUID,shareSecret,isThumbnail);
            }
        });
    }
}
