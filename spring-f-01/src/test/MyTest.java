package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;
import service.impl.UserServiceImpl;

/**
 * @author fermin
 */
public class MyTest {
    public static void main(String[] args) {
        // 加载 spring 上下文 加载ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service = ioc.getBean(IUserService.class);

//        IUserService service = new UserServiceImpl();
        service.getUser();

        service.addUser();
    }
}
