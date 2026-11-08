package com.prueba.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class AcademicoController {

    // Endpoint b): Regresa información simulada de un objeto/lista (Perfil y
    // materias)
    @GetMapping("/api/perfil")
    public Map<String, Object> obtenerPerfil() {
        return Map.of(
                "nombre", "Xana Amalinalli Pérez Jiménez",
                "carrera", "Ingeniería en Sistemas Computacionales",
                "instituto", "Instituto Tecnológico de Oaxaca",
                "materias", List.of("Taller de Investigación I", "Conmutación de Redes", "Programación Web"));
    }

    // Endpoint c): Respuesta adicional (texto o número simple)
    @GetMapping("/api/estado-servidor")
    public String obtenerEstado() {
        return "Estado: El servidor está activo, corriendo localmente sin errores.";
    }
}