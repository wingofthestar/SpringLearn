package site.yourdiary.anno.component.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.yourdiary.anno.component.bean.EmployeeService;
import site.yourdiary.anno.component.config.ComponentConfig;

/**
 * 测试component也能定义Bean
 */
public class AutowiredRequiredTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(ComponentConfig.class);
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
