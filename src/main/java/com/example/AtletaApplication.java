package com.example;

import com.example.service.AtletaService;
import com.example.service.MedallasService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AtletaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(AtletaApplication.class, args);

        AtletaService atletaService = context.getBean(AtletaService.class);
        MedallasService medallasService = context.getBean(MedallasService.class);

        atletaService.crearatleta();
        atletaService.testatleta();

        medallasService.crearmedalla();
        medallasService.testmedalla();

    }

}
