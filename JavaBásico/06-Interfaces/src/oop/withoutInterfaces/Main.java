package oop.withoutInterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeCRUDv1 employeeCRUD = new EmployeeCRUDv1();

        Employee firstEmployee = new Employee("Agustín", 45, 40000, true);
        Employee secondEmployee = new Employee("Esteban", 39, 50000, false);
        Employee thirdEmployee = new Employee("Sebastián", 33, 35000, true);

        employeeCRUD.save(firstEmployee);
        employeeCRUD.save(secondEmployee);
        employeeCRUD.save(thirdEmployee);

        List<Employee> employees = employeeCRUD.findAll();
        System.out.println(employees);

        EmployeeCRUDv2 employeeCRUDv2 = new EmployeeCRUDv2();

        Employee firstEmployeeV2 = new Employee("Jorge", 58, 60000, true);
        Employee secondEmployeeV2 = new Employee("Bautista", 23, 30000, true);
        Employee thirdEmployeeV2 = new Employee("Adalberto", 68, 100000, false);

        employeeCRUDv2.saveEmployee(firstEmployeeV2);
        employeeCRUDv2.saveEmployee(secondEmployeeV2);
        employeeCRUDv2.saveEmployee(thirdEmployeeV2);

        List<Employee> employeesV2 = employeeCRUDv2.readEmployees();
        System.out.println(employeesV2);

    }
}
