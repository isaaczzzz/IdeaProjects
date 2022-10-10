package cc.nozuch.service.impl;

import cc.nozuch.dao.BookDao;
import cc.nozuch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //业务层
public class BookServiceImpl implements BookService {
    /*自动装配依赖注入
    替代setter*/
    @Autowired
    //@Qualifier("bookDao2") //指定名称装配Bean
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    public void save() {
        System.out.println("Book service save...");
        bookDao.save();
    }

}
