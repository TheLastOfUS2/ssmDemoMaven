package com.dmsd.service;

import com.dmsd.api.UserService;
import com.dmsd.dao.TUserMapper;
import com.dmsd.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ares on 2017/10/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper tUserMapper;

    /**
     * 根据id查询用户信息-王雷-2017年10月24日10:36:02
     * @param Id 用户id
     * @return 用户实体信息
     */
    @Override
    public TUser findUserById(String Id) {
        return tUserMapper.selectByPrimaryKey(Id);
    }
}