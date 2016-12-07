package com.example.controller;

import com.example.domain.Medallas;
import com.example.repository.MedallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medals")
public class MedallasControler {
    @Autowired
    private MedallasRepository medallasRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medallas createMedal(@RequestBody Medallas medallas){
        return medallasRepository.save(medallas);
    }

    @GetMapping
    public List<Medallas> getAllMedals(){
        return medallasRepository.findAll();
    }

    @PutMapping
    public Medallas updateMedal(@RequestBody Medallas medallas){
        return medallasRepository.save(medallas);
    }

    @DeleteMapping("/{id}")
    public void deleteMedalID(@PathVariable Long id){
        Medallas medallas = medallasRepository.findOne(id);
        if(medallas != null ) medallasRepository.delete(id);
    }
}
