package spring.example.dao.impl;


import spring.example.dao.UserDao;
import spring.example.entity.User;

public class UserDaoImpl implements UserDao {

    private User user;

    public UserDaoImpl() {
    }

    public UserDaoImpl(User user) {
        System.out.println("依赖user自动装配，通过构造函数的方式注入到UserDaoImpl中");
        this.user = user;
    }

    public void setUser(User user) {
        System.out.println("依赖user自动装配，通过setter的方式注入到UserDaoImpl中");
        this.user = user;
    }

    @Override
    public void sayHello() {
        System.out.println(user.getName() + " say: hello world!");
    }
}
