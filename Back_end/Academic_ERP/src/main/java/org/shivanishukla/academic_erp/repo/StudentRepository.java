package org.shivanishukla.academic_erp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.shivanishukla.academic_erp.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT COUNT(s.id) " +
            "FROM Student s " +
            "WHERE s.batch_year = :batch_year")
    int countByBatch_year(@Param("batch_year") int batch_year);
}
