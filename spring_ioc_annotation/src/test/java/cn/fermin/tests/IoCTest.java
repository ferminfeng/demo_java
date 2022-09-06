package cn.fermin.tests;

import cn.fermin.beans.Role;
import cn.fermin.beans.User;
import org.junit.Before;
import org.junit.Test;
import cn.fermin.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    ClassPathXmlApplicationContext ioc;

    @Before
    public void before() {
        ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01() {
        UserController bean = ioc.getBean("userController", UserController.class);
        System.out.println(bean);

    }

    @Test
    public void test02() {
        User bean = ioc.getBean(User.class);
        System.out.println(bean.getName());

    }

    @Test
    public void test03() {
        UserController bean = ioc.getBean(UserController.class);
        bean.getBean();

    }

    @Test
    public void test04() {
        Role bean = ioc.getBean(Role.class);
        Role bean1 = ioc.getBean(Role.class);
        Role bean2 = ioc.getBean(Role.class);
    }

}
