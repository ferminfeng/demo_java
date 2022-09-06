package cn.fermin.test;

import cn.fermin.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

    @Test
    public void test01() {
        // 加载spring容器

        // ApplicationContext spring的顶层核心接口

        // ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器

        // FileSystemXmlApplicationContext 根据磁盘路径的xml配置来实例化spring容器

        // AnnotationConfigApplicationContext 根据 javaconfig 来配置实例化spring容器

        // 在容器实例化的时候就会加载所有的bean

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

        System.out.println("spring容器已加载");

        // 获取bean的方式
        // 1.通过类来获取bean
        User bean = ioc.getBean(User.class);

        // 2.通过bean的名字或者id来获取bean
//        User bean = (User) ioc.getBean("user");

        // 3.通过名字+类型
//        User bean = ioc.getBean("user2", User.class); // spring-ioc.xml里的user2

        // 内部默认调用
//        User user= new User();

        System.out.println(bean);


    }
}
