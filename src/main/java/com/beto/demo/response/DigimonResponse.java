package com.beto.demo.response;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DigimonResponse {

    private String message;

    public DigimonResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

