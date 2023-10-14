package cz.marek.dao;

import cz.marek.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
