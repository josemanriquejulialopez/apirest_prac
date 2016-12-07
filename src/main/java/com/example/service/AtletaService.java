package com.example.service;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;


    public void crearatleta() {

        Atleta atleta1 = new Atleta("Legolas", "Legolas", "Bosque Negro", LocalDate.of(1962, 8, 1));
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta("Aragon", "Aragon", "Minastirith", LocalDate.of(1999, 8, 8));
        atletaRepository.save(atleta2);
        Atleta atleta3 = new Atleta("Gimly", "Gimly", "Erebor", LocalDate.of(1970, 1, 3));
        atletaRepository.save(atleta3);
        Atleta atleta4 = new Atleta("Kalibord", "Kalibord", "Mordor", LocalDate.of(1994, 1, 1));
        atletaRepository.save(atleta4);
        Atleta atleta5 = new Atleta("Adobis", "Adobis", "Fangorn", LocalDate.of(1997, 1, 12));
        atletaRepository.save(atleta5);
        Atleta atleta6 = new Atleta("Lolrol", "Lolrol", "Hobbiton", LocalDate.of(1997, 1, 12));
        atletaRepository.save(atleta6);
    }

    public void testatleta(){
        System.out.println(atletaRepository.findByNacionalidadIs("Hobbiton"));
        System.out.println(atletaRepository.findByNacimientoBefore(LocalDate.of(1970, 12, 12)));
    }

}
