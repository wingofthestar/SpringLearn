package site.yourdiary.anno.component.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Autowired(required = false)
    private Employee employee;

    private String id;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void invokeEmployee(){
        employee.introduce();
        System.out.println("invokeEmployee执行了");
    }

}
