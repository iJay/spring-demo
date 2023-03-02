import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.config.SpringConfig;
import spring.example.dao.UserDao;
import spring.example.service.UserService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo09Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService1 = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);

        // 不指定bean名字 默认bean的名字是类名的小驼峰
        UserDao userDao = context.getBean("userDao1", UserDao.class);
        System.out.println(userDao);

        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        userService1.sayHello();
    }
}
