package config;

/**
 * @author Mr.jdy
 * @create 2020-04-21 21:08
 */

import bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import rule.MyRule;

/**
 * 配置类相当与之前的application-context.xml文件
 * @Configuration:声明一个Java类是配置类
 */
@Configuration
@ComponentScan(basePackages="com",includeFilters ={
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = {MyRule.class})
},useDefaultFilters = false)
public class MainConfig {

    /**
     * 给容器中注册一个bean 类型为返回值类型，id为方法名字，相当于之前配置文件的<bean>标签
     */
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = "person",initMethod = "initMethod",destroyMethod = "destoryMethod")
    public Person person(){
        return new Person("jdy",18);
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy(value = true)
    @Bean(name = "person")
    public Person person1(){
        return new Person("jdy",18);
    }

    /***
     *     String SCOPE_SINGLETON = "singleton";
     *              singleton:单实例对象，创建IOC容器时就会创建单实例对象，
     *     String SCOPE_PROTOTYPE = "prototype";
     *              prototype：多实例对象，并不会在创建IOC容器时就创建对象，是在没有调用获取对象的方法时，创建对象
     *
     *      懒加载：
     *          单实例bean,默认在容器启动的时候创建对象；
     *          懒加载：容器启动不创建对象，第一次使用（获取）Bean创建对象的时候，初始化
     */



}
