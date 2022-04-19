/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.models.impl;

import ec.com.tcs.TCS_Proyecto.models.dao.IUsuarioDao;
import ec.com.tcs.TCS_Proyecto.models.entity.Usuario;
import ec.com.tcs.TCS_Proyecto.models.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    private IUsuarioDao usuarioDao;
    
    @Override
    public Usuario findByUsername(String username) {
        return usuarioDao.findByUsername(username);
    }

    @Override
    public Usuario registrar(Usuario u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return usuarioDao.save(u);
    }    
}
