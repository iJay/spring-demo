package spring.example.service;

import spring.example.entity.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    void delete(int id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);

}
