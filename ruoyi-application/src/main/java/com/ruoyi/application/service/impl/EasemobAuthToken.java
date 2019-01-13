package com.ruoyi.application.service.impl;


import com.ruoyi.application.Util.TokenUtil;
import com.ruoyi.application.service.AuthTokenAPI;

public class EasemobAuthToken implements AuthTokenAPI {

	@Override
	public Object getAuthToken(){
		return TokenUtil.getAccessToken();
	}
}
