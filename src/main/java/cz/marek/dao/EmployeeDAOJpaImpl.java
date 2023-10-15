package cz.marek.dao;

import cz.marek.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int Id) {
        return entityManager.find(Employee.class, Id);
    }

    @Override
    public Employee save(Employee employee) {
        // if id == 0 -> save / else update
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int Id) {

        Employee employee = entityManager.find(Employee.class, Id);

        entityManager.remove(employee);
    }
}















