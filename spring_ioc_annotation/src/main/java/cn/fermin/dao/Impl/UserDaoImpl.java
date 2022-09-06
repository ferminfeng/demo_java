package cn.fermin.dao.Impl;

import cn.fermin.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("查询user数据库");
    }
}
