package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final Map<String, Employee> database = new HashMap<>();

    static {
        database.put("1111", new Employee("1111", "CAYDE", 20, "Male"));
        database.put("2222", new Employee("2222", "REET", 20, "Female"));
        database.put("3333", new Employee("3333", "PENNY", 20, "Female"));
    }


    @Override
    public Employee findById(String employeeId) {
        return database.get(employeeId);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Employee save(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        database.put(employee.getId(), employee);
        return database.get(employee.getId());
    }

    @Override
    public Employee update(String employeeId, Employee employee) {
        employee.setId(employeeId);
        database.put(employeeId, employee);
        return database.get(employeeId);
    }

    @Override
    public Employee delete(String employeeId) {
        return database.remove(employeeId);
    }

    @Override
    public List<Employee> findByAgeLargerThan(Integer age) {
        return new ArrayList<>(database.values()).stream().filter(item -> item.getAge() >= age).collect(Collectors.toList());
    }

}
