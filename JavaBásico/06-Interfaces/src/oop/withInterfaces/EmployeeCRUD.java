package oop.withInterfaces;
import oop.withoutInterfaces.Employee;
import java.util.List;

/*
 * Se declaran los métodos, no se implementan
 * Actúa como un contrato.
 * Dice lo que hay que hacer, pero no lo hace,
 * Proporciona una manera común de hacer las cosas
 * para todas las clases que implementan la interfaz.
 */
public interface EmployeeCRUD {
    void save(Employee employee);

    List<Employee> findAll();

    void delete(Employee employee);
}