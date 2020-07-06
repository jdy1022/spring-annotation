import bean.Car;
import config.MainConfig;
import config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.jdy
 * @create 2020-04-21 21:11
 */
public class XmlTest {



    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        Car bean = ac.getBean("car", Car.class);
        System.out.println("bean = " + bean);
    }


    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }

}
