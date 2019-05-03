package com.myegg.service.impl;


import com.myegg.dao.mapper.UserInfoMapper;
import com.myegg.model.UserInfoModel;
import com.myegg.pojo.UserInfo;
import com.myegg.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfoModel getUserInfoByName(String name) {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setName("雷瑞磊");
        return userInfoModel;
    }

    @Override
    public int save(UserInfoModel userInfoModel) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userInfoModel.getName());
        userInfo.setPassword(userInfoModel.getPassword());
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public int update(UserInfoModel update) {
        return 0;
    }

    @Override
    public UserInfoModel getUserInfoById(int id) {
        UserInfoModel userInfoModel = new UserInfoModel();
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        userInfoModel.setName(userInfo.getName());
        userInfoModel.setPassword(userInfo.getPassword());
        return userInfoModel;
    }

    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }
}
