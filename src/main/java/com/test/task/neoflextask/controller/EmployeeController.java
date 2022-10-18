package com.test.task.neoflextask.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.task.neoflextask.model.Employee;
import com.test.task.neoflextask.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/calculacte")
    public ResponseEntity<Double> getVacationPay(@RequestBody Employee employee) {
        Double vacationPay = employeeService.getVacationPay(employee);
        return ResponseEntity.ok(vacationPay);
    }
}
