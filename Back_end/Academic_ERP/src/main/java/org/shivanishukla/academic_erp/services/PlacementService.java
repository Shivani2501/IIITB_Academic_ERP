package org.shivanishukla.academic_erp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.shivanishukla.academic_erp.dto.PlacementStatsResponse;
import org.shivanishukla.academic_erp.repo.StudentRepository;
import org.shivanishukla.academic_erp.repo.PlacementStudentRepositoty;

@Service
@RequiredArgsConstructor
public class PlacementService {
    private final StudentRepository studentRepository;
    private final PlacementStudentRepositoty placementStudentRepositoty;

    public PlacementStatsResponse getPlacementStats(int batch_year) {
        int totalStudents=studentRepository.countByBatch_year(batch_year);
        int placedStudents = placementStudentRepositoty.countByAcceptanceTrueAndStudent_BatchYear(batch_year);
        int unplacedStudents = totalStudents-placedStudents;

        return new PlacementStatsResponse(placedStudents, unplacedStudents);
    }
}
