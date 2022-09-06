package cn.fermin.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.DependsOn;

/**
 * @program: spring_ioc_annotation
 * @description:
 * @author: fermin
 * @create: 2022-09-06 15:19
 **/
@Component
//@DependsOn("user") // 依赖于user，所以会先加载user类
//@Lazy // 懒加载
//@Scope("prototype") // 一个bean默认是单例， prototype:多例
public class Role {
    @Value("管理员")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(){
        System.out.println("role已加载");
    }

    // 生命周期回调-3 初始化回调
//    @PostConstruce
    public void init(){
        System.out.println("初始化");
    }

    // 生命周期回调-3 销毁回调
//    @PreDestory
    public void destory(){
        System.out.println("销毁");
    }

}
