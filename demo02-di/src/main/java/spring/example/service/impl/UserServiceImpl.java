package spring.example.service.impl;

import spring.example.dao.UserDao;
import spring.example.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao1(UserDao userDao) {
        System.out.println("依赖userDao通过setter的方式注入到UserServiceImpl中");
        this.userDao = userDao;
    }

    @Override
    public void sayHello() {
        userDao.sayHello();
    }
}
