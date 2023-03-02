package spring.example.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.example.dao.UserDao;
import spring.example.entity.User;

@Repository("userDao1")
public class UserDaoImpl implements UserDao {

    @Autowired
    private User user;

    @Override
    public void sayHello() {
        System.out.println(user.getName() + "say: hello world!");
    }
}
