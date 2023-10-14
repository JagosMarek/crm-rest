package cz.marek.service;

import cz.marek.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
