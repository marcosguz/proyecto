/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.controllers;

import ec.com.tcs.TCS_Proyecto.models.entity.Usuario;
import ec.com.tcs.TCS_Proyecto.models.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author marco
 */

@Controller
public class LoginController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    /*+===============================================+
    **|           Retorno a la vista Login            |
    **+===============================================+*/
    @GetMapping("/auth/login")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "login";
    }
    
    @GetMapping("/auth/registro")
    public String registroForm(Model model){
        model.addAttribute("usuario", new Usuario());
        
        return "registro";
    }
    
    @PostMapping("/auth/registro")
    public String registro(@ModelAttribute Usuario usuario, BindingResult result, Model model){
        
        if (result.hasErrors()) {
            return "redirect:/auth/registro";
        }
        else {
            model.addAttribute("usuario", usuarioService.registrar(usuario));
        }
        return "redirect:/auth/login";
    }
}
