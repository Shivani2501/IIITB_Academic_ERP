package org.shivanishukla.academic_erp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.shivanishukla.academic_erp.entity.Alumni;
public interface AlumniRepository extends JpaRepository<Alumni, Long> {

}
