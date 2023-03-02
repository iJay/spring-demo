package spring.example.dao.impl;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import spring.example.dao.UserDao;
import spring.example.entity.User;

public class UserDaoImpl implements UserDao, InitializingBean, DisposableBean {

    private User user;

    public void setUser(User user) {
        System.out.println("userDao set properties user ...");
        this.user = user;
    }

    @Override
    public void sayHello() {
        System.out.println(user.getName() + " say: hello world!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("dao destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dao init");
    }
}
