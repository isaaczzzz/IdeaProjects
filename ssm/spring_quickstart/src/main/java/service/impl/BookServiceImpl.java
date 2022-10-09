package service.impl;

import dao.BookDao;
import dao.UserDao;
import dao.impl.BookDaoImpl;
import service.BookService;

public class BookServiceImpl implements BookService {
    //5. 删除业务层中使用new方式创建的dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public void save() {
        System.out.println("Book service save...");
        bookDao.save();
        System.out.println("User service save...");
        userDao.save();
    }

    //6. 提供对于set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
