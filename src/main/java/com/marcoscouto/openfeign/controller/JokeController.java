package com.marcoscouto.openfeign.controller;

import com.marcoscouto.openfeign.client.JokeClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    private final JokeClient client;

    public JokeController(JokeClient client) {
        this.client = client;
    }

    @GetMapping("/joke")
    public ResponseEntity joke() {
        var response = client.getJoke();
        return ResponseEntity.ok(response);
    }

}
