import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class App {
    public static void main(String[] args) {
        //3. 获取IoC容器
        ApplicationContext cpx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //4. 获取Bean
        //BookDao bookDao = (BookDao) cpx.getBean("bookDao");
        //bookDao.save();
        BookService bookService = (BookService) cpx.getBean("bookService");
        bookService.save();
    }
}
