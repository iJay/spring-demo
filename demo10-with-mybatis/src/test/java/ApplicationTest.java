import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.example.config.SpringConfig;
import spring.example.entity.Account;
import spring.example.service.AccountService;

import java.util.List;

// 使用Spring整合Junit专用的类加载器
@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置文件或者配置类
@ContextConfiguration(classes = {SpringConfig.class})
// 加载配置文件
// @ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ApplicationTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById () {
        Account account = accountService.findById(1);
        System.out.println(account.getName() + " have money: $" + account.getMoney());
    }

    @Test
    public void testQueryAll () {
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account.getName() + " have money: $" + account.getMoney());
        }
    }

    @Test
    public void testAddAccount () {
        Account account = new Account();
        account.setId(3);
        account.setName("JayZhou");
        account.setMoney(1300000.00);
        accountService.save(account);
    }

}
