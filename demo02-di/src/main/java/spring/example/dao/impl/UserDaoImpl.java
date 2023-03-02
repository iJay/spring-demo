package spring.example.dao.impl;


import spring.example.dao.UserDao;
import spring.example.entity.User;

public class UserDaoImpl implements UserDao {

    private User user;

    private int foo;

    public UserDaoImpl() {
    }

    public UserDaoImpl(User user1, int foo) {
        System.out.println("依赖user通过构造函数的方式注入到UserDaoImpl中");
        System.out.println("foo: " + foo);
        this.user = user1;
    }

    @Override
    public void sayHello() {
        System.out.println(user.getName() + " say: hello world!");
    }
}
