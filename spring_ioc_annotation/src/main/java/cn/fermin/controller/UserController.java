package cn.fermin.controller;

import cn.fermin.beans.User;
import cn.fermin.service.BaseService;
import cn.fermin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    /*
     * 使用 @Autowired 来实现自动注入
     * bytype byname
     *
     * 默认优先根据类型去匹配
     *
     * 如果匹配到多个类型，则会按照名字去匹配
     * 如果名字又没有匹配到则会报错
     *  解决办法：
     *      1.可以去修改属性的名字对应bean的名字
     *          把 userService 改成 userServiceImpl
     *      2.可以去修改bean的名字，去对应属性的名字:  @Service(value = "userService")
     *      3.可以通过@Qualifier设置属性的名字(覆盖)：@Qualifier("userServiceImpl")
     *      4.可以通过@Primary 设置其中一个bean为主要的自动注入bean:@Primary
     *      5.使用泛型作为自动注入限定符
     */

    /*
     * @Autowired 和 @Resource 的区别
     * @Autowired 依赖spring 优先根据类型匹配
     * @Resource 依赖jdk 优先根据名字匹配
     */

//    @Autowired
//    @Qualifier("userServiceImpl")
//    @Resource
    UserService userService;

    /**
     * @Autowired 也可以写在方法上面
     * 默认优先根据参数类型去匹配
     * 如果匹配到多个类型则会按照参数名字匹配
     */
    @Autowired
    public void createUserService(UserService userService) {
        this.userService = userService;
    }

    public void getBean() {
        userService.getBean();
    }

}
