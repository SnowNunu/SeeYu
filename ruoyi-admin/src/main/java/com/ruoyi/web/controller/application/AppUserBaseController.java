package com.ruoyi.web.controller.application;

import com.ruoyi.application.domain.UserBase;
import com.ruoyi.application.service.IMUserAPI;
import com.ruoyi.application.service.IUserBaseService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.JsonResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.ServiceStaus;
import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息
 *
 * @author trc
 */
@Controller
@RequestMapping("/application/user")
public class AppUserBaseController {

    @Autowired
    IUserBaseService userBaseService;

    @Autowired
    IMUserAPI userAPI;

    @Log(title = "用户注册", businessType = BusinessType.INSERT)
    @PostMapping(value = "register")
    @ResponseBody
    @Transactional
    public JsonResult register(UserBase userBase){
        if (userBase.getUserPassword() == null || userBase.getUserPassword().equals("") ||
                userBase.getUserName() == null || userBase.getUserName().equals("") ||
                userBase.getUserAge() == null || userBase.getUserAge().equals("") ||
                userBase.getUserProfession() == null || userBase.getUserProfession().equals("") ||
                userBase.getUserIncome() == null || userBase.getUserIncome().equals("") ||
                userBase.getUserHeight() == null || userBase.getUserHeight().equals("") ||
                userBase.getUserMarry() == null || userBase.getUserMarry().equals("") ||
                userBase.getUserSpecialty() == null || userBase.getUserSpecialty().equals("")){
            return new JsonResult(ServiceStaus.REQUEST_PARAMS_LOSS);
        }
        if (userBaseService.insertUserBase(userBase) == 1) {
            // 本地注册成功后将用户注册到环信后台
            RegisterUsers registerUsers = new RegisterUsers();
            User user = new User().username(userBase.getUserId().toString()).password(userBase.getUserPassword());
            registerUsers.add(user);
            String result = userAPI.createNewIMUserSingle(registerUsers).toString();
            Map<String,String> object = new HashMap<String,String>();
            object.put("userId",userBase.getUserId().toString());
            return new JsonResult(ServiceStaus.REQUEST_REGISTER_OK,object);
        } else {
            return new JsonResult(ServiceStaus.REQUEST_REGISTER_FAIL);
        }
    }

}
