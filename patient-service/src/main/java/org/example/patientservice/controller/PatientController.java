package org.example.patientservice.controller;

import org.example.patientservice.dto.PatientResponseDTO;
import org.example.patientservice.model.Patient;
import org.example.patientservice.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatient() {
        List<PatientResponseDTO> patientResponseDTOList = patientService.getAllPatients();
        return ResponseEntity.ok().body(patientResponseDTOList);
    }
}
