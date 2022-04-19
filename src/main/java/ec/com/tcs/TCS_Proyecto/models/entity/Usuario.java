/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.tcs.TCS_Proyecto.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

/**
 *
 * @author marco
 */

@Entity
@Table(name = "Empleados_Ac")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Emp;
    
    @Column(name = "nombre_Emp", nullable = false)
    private String nombre;
    
    @Column(name = "apellido_Emp", nullable = false)
    private String apellido;
    
    @Column(name = "ultimatix_Emp", nullable = true)
    private String username;
    
    @Column(name = "telefono_Emp", nullable = false)
    private String telefono;
    
    @Email
    @Column(name = "email_Emp", nullable = true)
    private String email;
    
    @Column(name = "password_Emp", nullable = false)
    private String password;
    
    public Usuario() {
    }

    public Usuario(Long id_Emp, String nombre, String apellido, String username, String telefono, String email, String password) {
        this.id_Emp = id_Emp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    public Long getId_Emp() {
        return id_Emp;
    }

    public void setId_Emp(Long id_Emp) {
        this.id_Emp = id_Emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
