package oop.withoutInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUDv2 {

    List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> readEmployees() {
        return employees;
    }
}
