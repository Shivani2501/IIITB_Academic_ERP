package org.shivanishukla.academic_erp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmployeeLoginResponse(
        @NotNull(message = "first name should be present")
        @JsonProperty("first_name")
        String firstName,


        @JsonProperty("last_name")
        String lastName,

        @NotNull(message = "Department Name should be present")
        @JsonProperty("department_name")
        String departmentName
) {
}
