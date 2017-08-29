package site.yourdiary.anno.component.bean;

import org.springframework.stereotype.Component;


public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void introduce(){
        System.out.println(name);
    }
}
