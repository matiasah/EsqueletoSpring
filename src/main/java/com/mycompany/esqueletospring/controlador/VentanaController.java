/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esqueletospring.controlador;

import com.mycompany.esqueletospring.vista.Ventana;
import java.awt.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Matías Hermosilla
 */
@Component
public class VentanaController {
    
    @Autowired
    @Lazy
    private Ventana ventana;
    
    public VentanaController() {
        
    }
    
    @Override
    public String toString() {
        return "Objeto ventana controller";
    }
    
    public void hacerClick(ActionEvent e) {
        System.out.println("Mensaje");
    }
    
    public void hacerClick2(ActionEvent e) {
        
    }
    
}
