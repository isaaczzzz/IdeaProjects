import cc.nozuch.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cc.nozuch.service.BookService;

public class App {
    public static void main(String[] args) {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        BookService bookService = (BookService) cpx.getBean("bookService");
//        bookService.save();
        BookDao bookDao = (BookDao) cpx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = cpx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
