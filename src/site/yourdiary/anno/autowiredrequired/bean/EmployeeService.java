package site.yourdiary.anno.autowiredrequired.bean;


import org.springframework.beans.factory.annotation.Autowired;
import site.yourdiary.anno.autowiredrequired.pojo.Employee;


public class EmployeeService {
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
