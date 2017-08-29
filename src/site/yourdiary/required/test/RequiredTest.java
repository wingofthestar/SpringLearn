package site.yourdiary.required.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.yourdiary.required.bean.EmployeeService;


/**
 * 测试@Required
 * 注意@Required对于javaconfig配置的Bean是不起作用的，对于XML配置的Bean才起作用
 * https://stackoverflow.com/questions/16769360/how-does-required-annotation-work-with-javaconfig
 */
public class RequiredTest {

    private ApplicationContext context;

    @Before
    public void init(){
//        context = new AnnotationConfigApplicationContext(EmployeeServiceConfig.class);
        context = new ClassPathXmlApplicationContext("site/yourdiary/required/spring-config.xml");
    }

    @Test
    public void testRequired(){
        for (String name:
             context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        employeeService.invokeEmployee();
    }

}
