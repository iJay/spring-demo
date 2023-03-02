package spring.example.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.example.dao.UserDao;
import spring.example.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

    private User user;

    @Override
    public void sayHello() {
        System.out.println(user.getName() + "say: hello world!");
    }
}
