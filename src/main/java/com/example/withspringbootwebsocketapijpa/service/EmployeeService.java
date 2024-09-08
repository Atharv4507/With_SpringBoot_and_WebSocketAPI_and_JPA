package com.example.withspringbootwebsocketapijpa.service;

import java.util.List;

import com.example.withspringbootwebsocketapijpa.model.Employee;

public interface EmployeeService{
    List<Employee> findAll(); 
    Employee findByEid(int eid);
    Employee save(Employee e);
    int deleteByEid(int eid);
    List<Employee> findByEidLessThan(int eid);
    List<Employee> findByEidBetween(int low,int high);
    List<Employee> findByEnameContains(String ename);
}
