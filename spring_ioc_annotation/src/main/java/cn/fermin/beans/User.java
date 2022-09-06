package cn.fermin.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 一般不会将一个实体类注册为Bean
@Component
public class User {

    /*
     * 使用 @Value 注解设置依赖注入属性
     * 1. 除了可以写硬编码值
     * 2. 还可以写 ${} 、#{}
     */

    //    @Value("fermin") // 直接赋值
    //    @Value("${mysql.name}") // 获取外部属性资源文件的值，在spring_iox.xml里先引入外部属性资源文件
//    @Value("#{role.name}") // 引入其他类的值
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User(){
        System.out.println("user已加载");
    }
}
