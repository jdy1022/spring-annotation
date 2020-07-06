package config;

import bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 配置类相当与之前的application-context.xml文件
 * @Configuration:声明一个Java类是配置类
 */
@Configuration
@ComponentScan(value = "com.service",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {})
})
public class MyConfig {

    @Bean
    public Car car(){
        return new Car("红旗",999999.00,"黑色");
    }
}
