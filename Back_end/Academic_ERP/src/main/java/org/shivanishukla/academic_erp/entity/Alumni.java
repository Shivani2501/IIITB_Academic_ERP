package org.shivanishukla.academic_erp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "alumni")
public class Alumni {

    @Id
    @Column(name ="alumni_id",nullable = false,unique = true)
    private Long alumniId;

    @OneToOne
    @JoinColumn(name="student_id",nullable=false,unique=true)
    private Student student;

   @Column(name="contact_number")
   private String contactNumber;

    @Column(name="email",unique = true)
    private String email;
}
