package com.prueba.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificacionController {

    // Endpoint a): Regresa el nombre del proyecto o tus datos de identificación
    @GetMapping("/api/identificacion")
    public String identificacion() {
        return "Proyecto: XAPJact1_t4 | Alumna: Xana Amalinalli Pérez Jiménez (No. Control: 23161091)";
    }
}