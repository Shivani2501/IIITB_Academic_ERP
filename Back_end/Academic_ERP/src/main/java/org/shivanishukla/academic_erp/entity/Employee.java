package org.shivanishukla.academic_erp.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.print.DocFlavor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "empid", unique=true)
    private String EmpId;

    @Column(name="email" ,nullable = false)
    private String email;

    @Column(name = "Password",nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false)
    private Department departmentId;

    @Column(name="first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;
}
