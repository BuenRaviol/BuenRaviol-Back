package com.entidades.buenSabor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuenSaborApplication {
        private static final Logger logger = LoggerFactory.getLogger(BuenSaborApplication.class);
        public static void main(String[] args) {
                SpringApplication.run(BuenSaborApplication.class, args);
                logger.info("Estoy activo en el main");
        }
}