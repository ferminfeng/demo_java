package cn.fermin.test;

import cn.fermin.beans.Person;
import cn.fermin.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring ioc 基于xml 高级使用
 */
public class IoCTestH {
    ApplicationContext ioc;

    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring-ioc-high.xml");
    }

    @Test
    public void test01() {
        System.out.println("spring已加载");
    }

    @Test
    public void test02() {
        Person person = ioc.getBean("person",Person.class);
        Person person2 = ioc.getBean("person",Person.class);
        Person person3 = ioc.getBean("person",Person.class);
        Person person4 = ioc.getBean("person",Person.class);
        System.out.println(person);
    }
}
