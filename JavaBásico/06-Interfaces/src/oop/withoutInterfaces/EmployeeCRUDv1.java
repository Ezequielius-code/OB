package oop.withoutInterfaces;

import java.util.ArrayList;
import java.util.List;

/* C-reate
 * R-ead
 * U-pdate
 * D-elete
 */

public class EmployeeCRUDv1 {
    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findAll() {
        return employees;
    }
}
