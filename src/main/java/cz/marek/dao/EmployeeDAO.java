package cz.marek.dao;

import cz.marek.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int Id);

    Employee save(Employee employee);

    void deleteById(int Id);
}
