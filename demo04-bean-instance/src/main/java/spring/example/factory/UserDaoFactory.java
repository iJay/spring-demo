package spring.example.factory;

import spring.example.dao.UserDao;
import spring.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public static UserDao getUserDao () {
        System.out.println("bean userDao 以静态工厂方式实例化...");
        return new UserDaoImpl();
    }
}
