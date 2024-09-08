package com.example.withspringbootwebsocketapijpa.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.withspringbootwebsocketapijpa.model.Employee;
import com.example.withspringbootwebsocketapijpa.service.EmployeeService;




@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService es;
    @GetMapping("/")
    public List<Employee> m1() {
        return es.findAll();
    }

    @GetMapping("/findbyid/{a}")
    public Employee m2(@PathVariable("a") int param) {
        return es.findByEid(param);
    }
    
    /*Method is not excuting cuz of database drop and recreate to use it */
    @PostMapping("/save")
    public Employee m3(@RequestBody Employee e) {
        return es.save(e);
    }
    
    @PutMapping("/update")
    public Employee m4(@RequestBody Employee e) {
        return es.save(e);
    }

    @DeleteMapping("/delete/{a}")
    public int m5(@PathVariable("a") int eid){
        return es.deleteByEid(eid);
    }

    @GetMapping("/findbyidlessthan/{a}")
    public List<Employee> m6(@PathVariable("a")  int eid) {
        return es.findByEidLessThan(eid);
    }
    
    @GetMapping("/findbyidbetween/{a}/{b}")
    public List<Employee> m7(@PathVariable("a") int low,@PathVariable("b") int high) {
        return es.findByEidBetween(low, high);
    }
    
    /*Here use ?ename=YOUR_NAME */
    @GetMapping("/findbynamecontains")
    public List<Employee> m8(String ename) {
        return es.findByEnameContains(ename);
    }
    
    @GetMapping("/map")
    public Map<String,Collection> M9() {
        Map<String,Collection> m = new HashMap<>();
        List<String> listOfColors = new ArrayList<>();
        listOfColors.add("red");
        listOfColors.add("black");
        listOfColors.add("grey");
        listOfColors.add("white");
        m.put("listOfColors", listOfColors);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("travelling");
        hobbies.add("swimming");
        hobbies.add("dancing");
        m.put("hobies", hobbies);
        List<List<Employee>> s1 = new ArrayList<>();
        s1.add(es.findByEidBetween(998, 1001));
        s1.add(es.findByEidLessThan(3));
        s1.add(es.findByEnameContains("ath"));
        m.put("Employees", s1);
        return m;
    }
    
}
