/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.controllers;

import ec.com.tcs.TCS_Proyecto.models.entity.Usuario;
import ec.com.tcs.TCS_Proyecto.models.service.IUsuarioService;
import javax.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author marco
 */

@Controller
@RequestMapping("/private")
public class PrivateController {
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping("/index")
    public String index(Authentication auth, HttpSession session){
        String username = auth.getName();
        
        if (session.getAttribute("persona") == null) {
            Usuario usuario = usuarioService.findByUsername(username);
            usuario.setPassword(null);
            session.setAttribute("usuario", usuario);
        }
        return "index";
    }
}
