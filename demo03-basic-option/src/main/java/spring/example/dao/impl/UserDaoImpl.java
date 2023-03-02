package spring.example.dao.impl;


import spring.example.dao.UserDao;
import spring.example.entity.User;

public class UserDaoImpl implements UserDao {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void sayHello() {
        System.out.println(user.getName() + " say: hello world!");
    }
}
