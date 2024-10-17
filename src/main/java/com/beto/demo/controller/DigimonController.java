package com.beto.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beto.demo.response.DigimonResponse;
import com.beto.demo.service.DigimonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/digimon")
@RequiredArgsConstructor
public class DigimonController {

    private final DigimonService digimonService;

    @PostMapping("/digimon")
    @Operation(summary = "Create a Digimon")
    @ApiResponse(
        responseCode = "200",
        description = "Created",
        content = @Content(
            mediaType = "application/json",
            schema = @Schema(implementation = DigimonResponse.class) 
        )
    )
    public ResponseEntity<DigimonResponse> create(@RequestParam String digimonName) {
        DigimonResponse response = digimonService.createDigimon(digimonName);
        return ResponseEntity.ok(response);
    }
}
