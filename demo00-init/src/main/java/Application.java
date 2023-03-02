import spring.example.service.UserService;
import spring.example.service.impl.UserServiceImpl;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }
}
