package spring.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.example.dao.UserDao;
import spring.example.dao.impl.UserDaoImpl;
import spring.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void sayHello() {
        userDao.sayHello();
    }
}
