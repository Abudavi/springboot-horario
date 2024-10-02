package com.david.curso.springboot.calendar.interceptor.springboot_horario.controllers;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Bienvenidos al sistema de atencion a clientes!");
        data.put("time", new Date().toString());
        return ResponseEntity.ok(data);
    }

}
