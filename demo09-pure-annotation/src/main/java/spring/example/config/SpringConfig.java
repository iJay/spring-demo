package spring.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

// @Configuration用于设定当前类为配置类 相当于<context:component-scan base-package=""spring.example"/>
@Configuration
// @ComponentScan用于设定扫描路径，此注解只能添加一次，多个数据请用数组格式
// @ComponentScan({"spring.example.service","spring.example.dao","spring.example.entity"})
@ComponentScan({"spring.example"})
// @Import:导入配置信息 这里@ComponentScan({"spring.example"}) 其实已经扫描到config这个包了
@Import({JdbcConfig.class})
// {}可以省略不写 @PropertySource()中加载多文件请使用数组格式配置，不允许使用通配符
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
