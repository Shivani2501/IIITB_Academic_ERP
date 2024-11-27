package org.shivanishukla.academic_erp.dto;

import org.shivanishukla.academic_erp.entity.Alumni;
import org.shivanishukla.academic_erp.entity.AlumniOrganisation;
import org.shivanishukla.academic_erp.entity.Student;
import java.util.List;
public record PlacementHistoryResponse(
      Student student,
      Alumni alumni,
      List<AlumniOrganisation> organisations
) {
}
