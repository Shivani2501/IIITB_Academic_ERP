package org.shivanishukla.academic_erp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="student")
public class Student {
    @Id
    @Column(name="student_id")
    private String student_id;

    @Column(name = "name",nullable = false)
    private String name;



    @Column(name = "batch_year",nullable = false)
    private Integer batch_year;

    @ManyToOne
    @JoinColumn(name="domain_id",nullable = false)
    private Domain domain;

}
