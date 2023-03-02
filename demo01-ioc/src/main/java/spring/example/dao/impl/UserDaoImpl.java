package spring.example.dao.impl;


import spring.example.dao.UserDao;
import spring.example.entity.User;

public class UserDaoImpl implements UserDao {

    private User user = new User("周杰伦", 37);

    @Override
    public void sayHello() {
        System.out.println(user.getName() + "say: hello world!");
    }
}
