package org.shivanishukla.academic_erp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="domain")
public class Domain {
    @Id
    @Column(name="domain_id")
    private String Domain_id;

    @Column(name="domain_name",unique = true,nullable = false)
    private String domain_name;
}
