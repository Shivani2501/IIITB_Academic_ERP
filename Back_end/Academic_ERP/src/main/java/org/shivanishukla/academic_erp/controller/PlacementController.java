package org.shivanishukla.academic_erp.controller;

import lombok.RequiredArgsConstructor;
import org.shivanishukla.academic_erp.dto.PlacementStatsResponse;
import org.shivanishukla.academic_erp.helper.JWTHelper;
import org.shivanishukla.academic_erp.services.PlacementService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import jakarta.servlet.http.HttpServletRequest;
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/placement")
public class PlacementController {
    private final PlacementService placementService;
    private final JWTHelper jwtHelper;

    @GetMapping("/stats")
  //  public ResponseEntity<PlacementStatsResponse> getPlacementStats(@RequestParam int batchYear) {
    //    PlacementStatsResponse statsResponse = placementService.getPlacementStats(batchYear);
      //  return ResponseEntity.ok(statsResponse);
    //}
    public ResponseEntity<?> getPlacementStats(@RequestParam int batch_year, HttpServletRequest request) {
        try {
            // Extract and validate JWT token from the Authorization header
            String authorizationHeader = request.getHeader("Authorization");
            if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
                return ResponseEntity.status(401).body("Unauthorized: Missing or invalid token");
            }

            String token = authorizationHeader.substring(7); // Remove "Bearer " prefix
            String email = jwtHelper.extractEmail(token);

            // Validate token
            if (!jwtHelper.validateToken(token, email)) {
                return ResponseEntity.status(401).body("Unauthorized: Token is invalid or expired");
            }

            // Process the request if the token is valid
            PlacementStatsResponse statsResponse = placementService.getPlacementStats(batch_year);
            return ResponseEntity.ok(statsResponse);

        } catch (Exception e) {
            return ResponseEntity.status(401).body("Unauthorized: " + e.getMessage());
        }
    }
}
