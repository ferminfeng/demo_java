package dao.impl;

import dao.IUserDao;

/**
 * @author fermin
 */
public class UserDaoOracleImpl implements IUserDao {
    public void getUser(){
        System.out.println("查询oracle数据库");
    }

    @Override
    public void addUser() {
        System.out.println("添加oracle数据库");
    }
}
