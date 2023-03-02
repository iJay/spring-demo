package spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.example.dao.UserDao;
import spring.example.service.UserService;

public class ApplicationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);

        // 不指定bean名字 默认bean的名字是类名的小驼峰
        UserDao userDao = context.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
    }
}
