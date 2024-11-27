package org.shivanishukla.academic_erp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="alumni_organisation")
public class AlumniOrganisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="alumni_id",nullable = false)
    private Alumni alumni;

    @Column(name = "organization_name",nullable = false)
    private String organisationName;

    @Column(name="position",nullable = false)
    private String position;

    @Column(name = "joining_date",nullable = false)
    private LocalDate joiningDate;

    @Column(name="leaving_date")
    private LocalDate leavingDate;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false, unique = true)
    private Student student;



}
