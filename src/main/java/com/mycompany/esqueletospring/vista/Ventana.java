/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esqueletospring.vista;

import com.mycompany.esqueletospring.controlador.VentanaController;
import java.awt.FlowLayout;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Matías Hermosilla
 */
@Component
public class Ventana extends JFrame {
    
    @Autowired
    private VentanaController ventanaController;
    
    public Ventana() {
        
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());
        
        JButton boton = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        
        boton.addActionListener(
                e -> this.ventanaController.hacerClick(e)
        );
        
        boton2.addActionListener(
                e -> this.ventanaController.hacerClick2(e)
        );
        
        this.add(boton);
        this.add(boton2);
        
        this.setVisible(true);
        
    }
    
    @PostConstruct
    public void init() {
        
    }
    
}
