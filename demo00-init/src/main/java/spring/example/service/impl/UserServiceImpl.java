package spring.example.service.impl;

import spring.example.dao.UserDao;
import spring.example.dao.impl.UserDaoImpl;
import spring.example.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void sayHello() {
        userDao.sayHello();
    }
}
