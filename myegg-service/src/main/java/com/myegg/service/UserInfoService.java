package com.myegg.service;

import com.myegg.model.UserInfoModel;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public interface UserInfoService {

    public UserInfoModel getUserInfoByName(String name);

    public int save(UserInfoModel userInfoModel);

    public int  update(UserInfoModel update);

    public UserInfoModel getUserInfoById(int id);
}
