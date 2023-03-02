import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class Application {
    public static void main(String[] args) {
        // 类路径加载配置文件
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 文件路径加载配置文件
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\hblx2\\Desktop\\myDoc\\spring\\spring-demo\\demo07-load-properties\\src\\main\\resources\\applicationContext.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class); // 推荐使用 bean名称获取并指定类型
        System.out.println(dataSource);
    }
}
