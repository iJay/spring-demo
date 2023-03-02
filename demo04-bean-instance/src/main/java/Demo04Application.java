import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.service.UserService;

public class Demo04Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.sayHello();
        System.out.println("===================关闭容器======================");
        // ctx.close(); // ApplicationContext是顶级的抽象接口 不是该方法的实现类 需要使用ClassPathXmlApplicationContext类型
        ctx.registerShutdownHook();
    }
}