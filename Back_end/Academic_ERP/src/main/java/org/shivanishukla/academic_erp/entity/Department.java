package org.shivanishukla.academic_erp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name="department")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="department_id",unique = true)
  private Integer department_id;

  @Column(name="name",nullable = false,unique = true)
  private String name;

  @Column(name = "capacity",nullable = false)
    private int capacity;
}
