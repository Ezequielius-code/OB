package oop.withInterfaces;

import oop.withoutInterfaces.Employee;

public class Main {

    static EmployeeCRUD employeeCRUD = new EmployeeCRUDExcel();

    /*Si quiero cambiar a la base de datos, solo realizo el siguiente cambio:
     * static EmployeeCRUD employeeCRUD = new EmployeeCRUDMySQL();
     */

    public static void main(String[] args) {
        employeeCRUD.findAll();
        employeeCRUD.save(new Employee());
    }
}
