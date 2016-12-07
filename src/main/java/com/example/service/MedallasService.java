package com.example.service;

import com.example.domain.Medallas;
import com.example.domain.TipoMedallas;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedallasService {

    @Autowired
    private MedallasRepository medallasRepository;
    @Autowired
    private AtletaRepository atletaRepository;

    public void crearmedalla() {
        Medallas medalla1 = new Medallas(TipoMedallas.ORO, "Matar", "Mordor");
        medalla1.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla1);

        Medallas medalla2 = new Medallas(TipoMedallas.ORO, "Asistir", "Rohan");
        medalla2.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla2);

        Medallas medalla3 = new Medallas(TipoMedallas.PLATA, "Ayudar", "La comarca");
        medalla3.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla3);

        Medallas medalla4 = new Medallas(TipoMedallas.PLATA, "Curar", "Hobbiton");
        medalla4.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla4);

        Medallas medalla5 = new Medallas(TipoMedallas.BRONCE, "Aterrorizar", "Minastirith");
        medalla5.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla5);

        Medallas medalla6 = new Medallas(TipoMedallas.BRONCE, "Morir", "Helm");
        medalla6.setAtleta(atletaRepository.findByNombreIs("Lolrol"));
        medallasRepository.save(medalla6);

    }
    public void testmedalla(){

    }


}
