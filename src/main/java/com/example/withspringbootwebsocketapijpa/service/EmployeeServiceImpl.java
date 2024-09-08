package com.example.withspringbootwebsocketapijpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.withspringbootwebsocketapijpa.dao.EmployeeDao;
import com.example.withspringbootwebsocketapijpa.model.Employee;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao ed;

    @Override
    public List<Employee> findAll() {
        return ed.findAll();
    }

    @Override
    public Employee findByEid(int eid) {
        return ed.findByEid(eid);
    }

    @Override
    public Employee save(Employee e) {
        return ed.save(e);
    }

    @Override
    public int deleteByEid(int eid) {
        return ed.deleteByEid(eid);
    }

    @Override
    public List<Employee> findByEidLessThan(int eid) {
        return ed.findByEidLessThan(eid);
    }

    @Override
    public List<Employee> findByEidBetween(int low, int high) {
        return ed.findByEidBetween(low, high);
    }

    @Override
    public List<Employee> findByEnameContains(String ename) {
        return ed.findByEnameContains(ename);
    }
    
   
    
}
