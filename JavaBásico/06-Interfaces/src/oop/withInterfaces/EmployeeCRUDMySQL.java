package oop.withInterfaces;

import oop.withoutInterfaces.Employee;

import java.util.List;

public class EmployeeCRUDMySQL implements EmployeeCRUD, EmployeeReader{
    @Override
    public void save(Employee employee) {

    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void delete(Employee employee) {

    }
}
