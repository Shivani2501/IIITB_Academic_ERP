package org.shivanishukla.academic_erp.services;

import lombok.RequiredArgsConstructor;
import org.shivanishukla.academic_erp.entity.Student;
import org.springframework.stereotype.Service;
import org.shivanishukla.academic_erp.dto.PlacementStatsResponse;
import org.shivanishukla.academic_erp.repo.StudentRepository;
import org.shivanishukla.academic_erp.repo.PlacementStudenttRepository;
import org.shivanishukla.academic_erp.repo.AlumniOrganisationRepository;
import org.shivanishukla.academic_erp.dto.FilteredStudentReponse;
import java.util.List;

@Service
@RequiredArgsConstructor

public class PlacementService {
    private final StudentRepository studentRepository;
    private final PlacementStudenttRepository placementStudentRepositoty;
    private final AlumniOrganisationRepository alumniOrganisationRepository;

    public PlacementStatsResponse getPlacementStats(int batch_year) {
        int totalStudents=studentRepository.countByBatch_year(batch_year);
        int placedStudents = placementStudentRepositoty.countByAcceptanceTrueAndStudent_BatchYear(batch_year);
        int unplacedStudents = totalStudents-placedStudents;

        return new PlacementStatsResponse(placedStudents, unplacedStudents);
    }
    public List<Student> getStudentsByOrganisationDomainYear(String organisationName, String domainName, int batchYear) {
        return alumniOrganisationRepository.findStudentsByOrganisationDomainYear(organisationName, domainName, batchYear);
    }
    public List<FilteredStudentReponse> getFilteredStudents(String organisationName, String domainName, int batchYear) {
        List<Student> students = alumniOrganisationRepository.findStudentsByOrganisationDomainYear(organisationName, domainName, batchYear);
        return students.stream()
                .map(student -> new FilteredStudentReponse(
                        student.getStudent_id(),
                        student.getName(),
                        student.getDomain().getDomain_name(),
                        student.getBatch_year()))
                .toList();
    }


}

