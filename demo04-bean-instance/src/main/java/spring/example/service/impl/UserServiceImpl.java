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

    //表示bean初始化对应的操作
    public void init(){
        System.out.println("UserService init...");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("UserService destory...");
    }
}
