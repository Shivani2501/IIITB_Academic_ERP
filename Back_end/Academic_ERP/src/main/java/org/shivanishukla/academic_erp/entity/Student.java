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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="student_id",unique = true,nullable = false)
    private String student_id;

    @Column(name = "name",nullable = false)
    private String name;



    @Column(name = "batch_year",nullable = false)
    private Integer batch_year;


}
