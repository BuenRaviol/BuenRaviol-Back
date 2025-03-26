package com.entidades.buenSabor;

import com.entidades.buenSabor.domain.entities.*;
import com.entidades.buenSabor.domain.enums.*;
import com.entidades.buenSabor.repositories.*;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.time.LocalDate;
import java.time.LocalTime;


@SpringBootApplication
public class BuenSaborApplication {
        private static final Logger logger = LoggerFactory.getLogger(BuenSaborApplication.class);
        public static void main(String[] args) {
                SpringApplication.run(BuenSaborApplication.class, args);
                logger.info("Estoy activo en el main");
        }

}