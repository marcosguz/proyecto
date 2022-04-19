/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author marco
 */

@Controller
public class InicioController {
    
    /*+================================================+
    **|              Devuelve la vista                 |
    **+================================================+*/
    @GetMapping("/")
    public String inicio(){
        return "inicio";
    } 
}
