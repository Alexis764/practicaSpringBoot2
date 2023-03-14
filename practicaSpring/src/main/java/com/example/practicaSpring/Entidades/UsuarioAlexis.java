package com.example.practicaSpring.Entidades;

import java.time.LocalDate;

public class UsuarioAlexis {

    private int idUsuario;
    private String nombre, pais, correo;
    private LocalDate fechaNacimiento;

    public UsuarioAlexis(int idUsuario, String nombre, String pais, LocalDate fechaNacimiento, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }


    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
