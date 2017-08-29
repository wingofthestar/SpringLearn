package site.yourdiary.anno.autowiredrequired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.anno.autowiredrequired.bean.EmployeeService;

@Configuration
//@ComponentScan("site.yourdiary.anno.required")
public class EmployeeServiceConfig {

    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService();
    }
}
