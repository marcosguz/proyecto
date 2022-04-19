/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.models.dao;

import ec.com.tcs.TCS_Proyecto.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marco
 */

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
    /*+============================================+
    **|         Busqueda de usuarios               |
    **+============================================+*/
    public Usuario findByUsername(String username);
    
}
