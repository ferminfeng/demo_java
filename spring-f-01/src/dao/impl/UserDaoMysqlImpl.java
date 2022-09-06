package dao.impl;

import dao.IUserDao;

/**
 * @author fermin
 */
public class UserDaoMysqlImpl implements IUserDao {
    @Override
    public void getUser() {
        // 查询数据
        System.out.println("查询mysql数据库");

    }

    public void addUser(){
        // 新增数据
        System.out.println("新增mysql数据库");
    }

}
