package spring.example.service;

import spring.example.dao.UserDao;

public interface UserService {
    void sayHello();

    void setUserDao1(UserDao userDao1);

    void init();

    void destory();
}
