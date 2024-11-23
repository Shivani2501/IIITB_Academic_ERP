package org.shivanishukla.academic_erp.services;

import lombok.RequiredArgsConstructor;
import org.shivanishukla.academic_erp.dto.EmployeeLoginRequest;
import org.shivanishukla.academic_erp.dto.EmployeeLoginResponse;

import org.shivanishukla.academic_erp.helper.JWTHelper;
import org.shivanishukla.academic_erp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.shivanishukla.academic_erp.entity.Employee;
import org.shivanishukla.academic_erp.repo.EmployeeRepository;
import org.shivanishukla.academic_erp.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final JWTHelper jwtHelper;
    private final EmployeeMapper employeeMapper;

    public String login(EmployeeLoginRequest request) {
        Employee employee=employeeRepository.findByEmail(request.email());
        //if(employeeOptional.isEmpty()){
         //   throw new IllegalArgumentException("Invalid email or password");
       // }
        //Employee employee=employeeOptional.get();

        if(!employee.getPassword().equals(request.password())){
            throw new IllegalArgumentException("Invalid email or password");
        }
        return jwtHelper.generateToken(request.email());
    }
}
