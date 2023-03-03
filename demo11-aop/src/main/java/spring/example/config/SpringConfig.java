package spring.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.example")
// 开启注解开发AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {
}
