package spring.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import spring.example.dao.UserDao;

import javax.sql.DataSource;

public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean // 表示当前方法的返回值是一个bean对象，添加到IOC容器中
    public DataSource dataSource (UserDao userDao) {
        // 引用类型注入只需要为bean定义方法设置形参即可，容器会根据类型自动装配对象
        System.out.println(userDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }
}
