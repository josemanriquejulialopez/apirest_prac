package com.example.controller;

import com.example.domain.Atleta;
import com.example.domain.TipoMedallas;
import com.example.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by dam on 7/12/16.
 */

@RestController
@RequestMapping("/atletas")
public class AtletaController {
    @Autowired
    private AtletaRepository atletaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta createAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @GetMapping
    public List<Atleta> getAllAtletas() {
        return atletaRepository.findAll();
    }

    @PutMapping
    public Atleta updateAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @DeleteMapping("/{id}")
    public void deleteAtletaID(@PathVariable Long id) {
        Atleta atleta = atletaRepository.findOne(id);
        if (atleta != null) atletaRepository.delete(id);
    }

    @GetMapping("/GroupByNacionalidad")
    public Map<String, List<Atleta>> getAtletaGroupByNacionalidad(){
        return atletaRepository
                .findAll()
                .parallelStream()
                .collect(groupingBy(Atleta::getNacionalidad));
    }

    @GetMapping("/GroupByTipoMedallas")
    public Map<TipoMedallas, List<Atleta>> getAtletaGroupByTipoMedallas(){

        return atletaRepository
                .findAll()
                .parallelStream()
                .collect(groupingBy(atleta-> {
                    if(atleta.getMedallas().stream().anyMatch(medallas -> medallas.getTipoMedallas() == TipoMedallas.ORO)){
                        return TipoMedallas.ORO;
                    }else if(atleta.getMedallas().stream().anyMatch(medallas -> medallas.getTipoMedallas() == TipoMedallas.PLATA)){
                        return TipoMedallas.PLATA;
                    }else if(atleta.getMedallas().stream().anyMatch(medallas -> medallas.getTipoMedallas() == TipoMedallas.BRONCE)){
                        return TipoMedallas.BRONCE;
                    }else {
                        return TipoMedallas.NULL;
                    }
                }));
    }



}