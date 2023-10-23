package com.skbprod.skbprod.entregas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/entregas")
public class EntregaController {
    @Autowired
    private EntregaRepository entregaRepository;

    @GetMapping
    public List<Entrega> getAllEntregas() { return entregaRepository.findAll(); }

    @PostMapping
    public Entrega createEntrega(@RequestBody Entrega entrega) { return entregaRepository.save(entrega); }

    @DeleteMapping("/{id}")
    public void deleteEntrega(@PathVariable Long id) {
            entregaRepository.deleteById(id);
    }
}
