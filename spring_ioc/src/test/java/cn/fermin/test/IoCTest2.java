package cn.fermin.test;

import cn.fermin.beans.Person;
import cn.fermin.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest2 {
    ApplicationContext ioc;

    @Before
    public void before(){

        // 加载spring容器

        // ApplicationContext spring的顶层核心接口

        // ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器

        // FileSystemXmlApplicationContext 根据磁盘路径的xml配置来实例化spring容器

        // AnnotationConfigApplicationContext 根据 javaconfig 来配置实例化spring容器

        // 在容器实例化的时候就会加载所有的bean

        ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
    }

    @Test
    public void test01() {
        System.out.println("test01:spring容器已加载");

        User bean = ioc.getBean("user",User.class);
        System.out.println(bean);
    }

    @Test
    public void test02(){
        System.out.println("test02:spring容器已加载");

        User bean = ioc.getBean("user2",User.class);
        System.out.println(bean);
    }

    /**
     * 基于setter方法的依赖注入
     */
    @Test
    public void test03(){
        System.out.println("test03:spring容器已加载");

        User bean = ioc.getBean("user3",User.class);
        System.out.println(bean);
    }

    /**
     * 基于构造函数的依赖注入
     */
    @Test
    public void test04(){
        System.out.println("test04:spring容器已加载");

        User bean = ioc.getBean("user4",User.class);
        System.out.println(bean);
    }

    /**
     * 复杂数据类型的依赖注入
     */
    @Test
    public void test05(){
        Person bean = ioc.getBean("person",Person.class);
        System.out.println(bean);
    }

}
