package spring.example.factory;

import javafx.application.Application;
import javafx.stage.Stage;
import spring.example.service.UserService;
import spring.example.service.impl.UserServiceImpl;

public class UserServiceFactory {
    public UserService getUserService () {
        System.out.println("bean userService 以实例工厂的方式实例化...");
        return new UserServiceImpl();
    }
}
