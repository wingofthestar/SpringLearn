package site.yourdiary.autowiredrequired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.yourdiary.autowiredrequired.bean.EmployeeService;

@Configuration
//@ComponentScan("site.yourdiary.required")
public class EmployeeServiceConfig {

    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService();
    }
}
