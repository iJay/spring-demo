import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.entity.User;
import spring.example.service.UserService;

public class Demo03Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = ctx.getBean(UserService.class);
        UserService userService2 = ctx.getBean(UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println("================name 别名===============");

        User user = (User) ctx.getBean("user");
        User user1 = (User) ctx.getBean("user1");
        User user2 = (User) ctx.getBean("userEntity");
        User user3 = (User) ctx.getBean("userPojo");
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("=======按类型取bean对象, 保证该类型是唯一的！=======");

        User user4 = ctx.getBean(User.class);
        System.out.println(user4);
    }
}
