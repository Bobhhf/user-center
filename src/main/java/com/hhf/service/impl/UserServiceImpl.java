package com.hhf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhf.model.domain.User;
import com.hhf.mapper.UserMapper;
import com.hhf.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 64907
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-04-16 19:13:32
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public int userRegister(User user) {

        return 0;
    }
}




