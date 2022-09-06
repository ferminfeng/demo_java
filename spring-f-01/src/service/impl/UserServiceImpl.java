package service.impl;

import dao.IUserDao;
import service.IUserService;

/**
 * @author fermin
 */
public class UserServiceImpl implements IUserService {

    //    IUserDao dao = new UserDaoImpl();
    IUserDao dao;

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void getUser() {
        dao.getUser();
    }

    @Override
    public void addUser() {
        dao.addUser();
    }
}
