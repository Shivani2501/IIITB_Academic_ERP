package org.shivanishukla.academic_erp.mapper;

import org.shivanishukla.academic_erp.dto.EmployeeLoginResponse;
import org.shivanishukla.academic_erp.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public EmployeeLoginResponse toLoginResponse(Employee employee) {
        return new EmployeeLoginResponse(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getDepartmentId().getName()

        );
    }
}
