package org.shivanishukla.academic_erp.controller;

import lombok.RequiredArgsConstructor;
import org.shivanishukla.academic_erp.dto.EmployeeLoginRequest;
import org.shivanishukla.academic_erp.dto.EmployeeLoginResponse;

import org.shivanishukla.academic_erp.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor

public class Employeecontroller {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody EmployeeLoginRequest LoginRequest) {
        String response=employeeService.login(LoginRequest);
            if(response.startsWith("Wrong")){
                return ResponseEntity.badRequest().body(response);

            }
            return ResponseEntity.ok(response);

    }
}
