package spring.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import spring.example.dao.UserDao;
import spring.example.service.UserService;

@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    // @Autowired默认按照类型自动装配，如果IOC容器中同类的Bean有多个，那么默认按照变量名和Bean的名称匹配，
    // 自动装配基于反射设计创建对象并暴力反射对应属性为私有属性初始化数据，因此无需提供setter方法。
    @Autowired
    // 建议使用@Qualifier注解指定要装配的bean名称
    // tips: @Qualifier注解无法单独使用，必须配合@Autowired注解使用
    @Qualifier("userDao1")
    private UserDao userDao;

    @Override
    public void sayHello() {
        userDao.sayHello();
    }
}
