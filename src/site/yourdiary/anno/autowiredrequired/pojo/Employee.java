package site.yourdiary.anno.autowiredrequired.pojo;

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
