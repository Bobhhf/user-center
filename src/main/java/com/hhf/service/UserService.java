package com.hhf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhf.model.domain.User;

/**
* @author 64907
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-04-16 19:13:32
*/
public interface UserService extends IService<User> {
    int userRegister(User user);
}

