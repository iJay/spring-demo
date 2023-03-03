package spring.example.dao.impl;

import org.springframework.stereotype.Repository;
import spring.example.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }
    public void update(){
        System.out.println("book dao update ...");
    }
}
