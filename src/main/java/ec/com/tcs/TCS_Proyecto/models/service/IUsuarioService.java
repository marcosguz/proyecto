/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.models.service;

import ec.com.tcs.TCS_Proyecto.models.entity.Usuario;

/**
 *
 * @author marco
 */

public interface IUsuarioService {
    public Usuario findByUsername(String username);
    
    public Usuario registrar(Usuario u);
}
