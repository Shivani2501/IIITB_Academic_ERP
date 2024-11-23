package org.shivanishukla.academic_erp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
public record PlacementStatsResponse(@JsonProperty("placed_students")
                                      int placedStudents,

                                     @JsonProperty("unplaced_students")
                                      int unplacedStudents) {

}
