package com.jrp.pma.projectmanagement.dao;

import com.jrp.pma.projectmanagement.entities.Employee;
import com.jrp.pma.projectmanagement.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();
}
