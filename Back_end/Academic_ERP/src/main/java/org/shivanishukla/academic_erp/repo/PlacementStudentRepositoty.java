package org.shivanishukla.academic_erp.repo;

import org.shivanishukla.academic_erp.entity.PlacementStudent;
import org.shivanishukla.academic_erp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementStudentRepositoty extends JpaRepository<PlacementStudent, Long> {
    @Query("SELECT COUNT(ps.id) " +
            "FROM PlacementStudent ps " +
            "JOIN ps.student s " +
            "WHERE ps.acceptance = TRUE " +
            "AND s.batch_year = :batch_year")
    int countByAcceptanceTrueAndStudent_BatchYear(int batch_year);
}
