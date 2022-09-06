package cn.fermin.service.impl;

import cn.fermin.beans.Role;
import cn.fermin.dao.UserDao;
import cn.fermin.service.BaseService;
import cn.fermin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author fermin
 */
@Service
// @Primary // 设置自动注入的主要bean
public class RoleServiceImpl implements RoleService {

    @Autowired
    UserDao userDao;

    @Override
    public void getBean() {
        System.out.println("roleServiceImpl");
        userDao.getUser();
    }
}
