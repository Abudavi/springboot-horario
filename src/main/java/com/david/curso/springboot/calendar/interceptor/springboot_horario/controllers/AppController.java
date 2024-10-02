package com.david.curso.springboot.calendar.interceptor.springboot_horario.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo() {
        Map<String, Object> data = Collections.singletonMap("title", "Bienvenidos al sistema de atencion a clientes!");
        return ResponseEntity.ok(data);
    }

}
