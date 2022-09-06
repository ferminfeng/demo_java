package cn.fermin.service.impl;

import cn.fermin.beans.User;
import cn.fermin.dao.UserDao;
import cn.fermin.service.BaseService;
import cn.fermin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary // 设置自动注入的主要bean
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void getBean() {
        System.out.println("userServiceImpl");
        userDao.getUser();
    }
}
