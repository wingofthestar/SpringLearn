package site.yourdiary.anno.required.bean;


import org.springframework.beans.factory.annotation.Required;
import site.yourdiary.anno.autowiredrequired.pojo.Employee;

public class EmployeeService {
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

    @Required
    public void setId(String id) {
        this.id = id;
    }

    public void invokeEmployee(){
        System.out.println("invokeEmployee执行了");
    }

}
