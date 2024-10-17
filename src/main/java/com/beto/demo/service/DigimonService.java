package com.beto.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.beto.demo.response.DigimonResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DigimonService {
    
    public DigimonResponse createDigimon(String digimonName) {
        String message = "Digimon com o nome de: " + digimonName + " foi criado com sucesso";
        return new DigimonResponse(message); 
    }
    
}
