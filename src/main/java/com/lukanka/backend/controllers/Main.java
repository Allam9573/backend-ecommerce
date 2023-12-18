package com.lukanka.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping({ "", "/" })
    public String index() {
        return "Estimado usuario, no tiene acceso autorizado";
    }

}
