package com.example.withspringbootwebsocketapijpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.withspringbootwebsocketapijpa.model.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
    List<Employee> findAll(); 
    Employee findByEid(int eid);
    Employee save(Employee e);
    int deleteByEid(int eid);
    List<Employee> findByEidLessThan(int eid);
    List<Employee> findByEidBetween(int low,int high);
    List<Employee> findByEnameContains(String ename);
}
