package spring.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({JdbcConfig.class, MybatisConfig.class})
@ComponentScan("spring.example")
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
