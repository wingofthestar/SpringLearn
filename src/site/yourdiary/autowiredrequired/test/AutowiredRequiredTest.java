package site.yourdiary.autowiredrequired.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.autowiredrequired.bean.EmployeeService;
import site.yourdiary.autowiredrequired.config.EmployeeServiceConfig;

/**
 * 测试@Autowired(required = flase)
 */
public class AutowiredRequiredTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(EmployeeServiceConfig.class);
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
