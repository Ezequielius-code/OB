package oop.withoutInterfaces;

public class Employee {
    String name;
    int age;
    double salary;
    boolean isDischarged;

    public Employee() {}

    public Employee(String name, int age, double salary, boolean isDischarged) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isDischarged = isDischarged;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isDischarged=" + isDischarged +
                "}\n";
    }
}
