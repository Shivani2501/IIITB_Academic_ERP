package org.shivanishukla.academic_erp.repo;

import org.shivanishukla.academic_erp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.shivanishukla.academic_erp.entity.AlumniOrganisation;
import java.util.List;
@Repository
public interface AlumniOrganisationRepository extends JpaRepository<AlumniOrganisation, Long> {
    @Query("SELECT ao.alumni.student FROM AlumniOrganisation ao " +
            "WHERE ao.organisationName = :organisationName " +
            "AND ao.alumni.student.domain.domain_name = :domainName " +
            "AND ao.alumni.student.batch_year = :batchYear")
    List<Student> findStudentsByOrganisationDomainYear( @Param("organisationName") String organisationName, @Param("domainName") String domainName, @Param("batchYear") int batchYear);


}
