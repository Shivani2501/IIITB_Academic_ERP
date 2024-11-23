package org.shivanishukla.academic_erp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record EmployeeLoginRequest(
        @NotNull(message = "Email is needed")
        @Email(message = "Email is required for login")
        @JsonProperty("email")
        String email,

        @NotNull(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        @NotEmpty(message = "Password should be present")
        @JsonProperty("password")
        String password

      //  @JsonProperty("department_id")
       // int departmentId
) {
}
