/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esqueletospring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Matías Hermosilla
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    // Configuración de la aplicación
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        // Crear aplicación de SpringBoot con interfaces gráficas (AWT)
        new SpringApplicationBuilder(Application.class).headless(false).run(args);
    }

    @Override
    public void run(String[] args) throws Exception {

    }

}
