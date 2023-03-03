package spring.example.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类 通知类
@Aspect
public class MyAdvice {

    // 设置切入点1，@Pointcut注解要求配置在方法上方
    @Pointcut("execution(void spring.example.dao.BookDao.update())")
    public void pt1 () {}

    @Pointcut("execution(void spring.example.dao.BookDao.save())")
    public void pt2 () {}

    // 设置在切入点pt()的前面运行当前操作(前置通知)
    @Before("pt1()")
    public void method1(){ // 通知方法
        System.out.println("执行时间计时：" + System.currentTimeMillis());
    }

    // 当前通知方法在原始切入点方法前后运行
    @Around("pt2()")
    public Object method2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前....");
        Object proceed = pjp.proceed();
        System.out.println("环绕后....");
        return proceed;
    }
}
