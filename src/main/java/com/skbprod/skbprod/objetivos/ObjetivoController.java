package com.skbprod.skbprod.objetivos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/objetivos")
public class ObjetivoController {
    @Autowired
    private ObjetivoRepository objetivoRepository;

    @GetMapping
    public List<Objetivo> getAllObjetivos() { return objetivoRepository.findAll(); }

    @PostMapping
    public Objetivo createObjetivo(@RequestBody Objetivo objetivo) { return objetivoRepository.save(objetivo); }

    @DeleteMapping("/{id}")
    public void deleteObjetivo(@PathVariable Long id) { objetivoRepository.deleteById(id); }
}
