package com.myegg.controller;

import com.myegg.model.UserInfoModel;
import com.myegg.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getUserInfo.json",method = RequestMethod.GET)
    public Map<String, Object> getUserInfo(HttpServletRequest request, ModelMap modelMap) {
        String id = request.getParameter("id");
        Map<String, Object> result = new HashMap<>();

        if(!StringUtils.isEmpty(id)){
            result.put("success", true);
            result.put("data", userInfoService.getUserInfoById(Integer.parseInt(id)));
        }else{
            result.put("success", false);
        }

        return result;
    }
    @RequestMapping(value="/saveUserInfo.json",method = RequestMethod.GET)
    public Map<String, Object> saveUserInfo(HttpServletRequest request, ModelMap modelMap, @ModelAttribute UserInfoModel userInfoModel) {
        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("data", userInfoService.save(userInfoModel));
        return result;
    }
}
