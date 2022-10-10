package cc.nozuch.dao.impl;

import cc.nozuch.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Component
@Repository("bookDao") //数据层注解
public class BookDaoImpl implements BookDao {
    //@Value: 用于实现简单类型注入
    //@Value("AAA")

    //从properties注入
    @Value("${name}")
    private String name;
    public void save() {
        System.out.println("Book dao save... "+this.name);
    }
}
