package com.example.repository;

import com.example.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by dam on 7/12/16.
 */
public interface AtletaRepository extends JpaRepository<Atleta, Long> {

    List<Atleta> findByNacionalidadIs(String nacionalidad);
    List<Atleta> findByNacimientoBefore(LocalDate nacimiento);
    Atleta findByNombreIs(String name);

}
