package com.example.practicaSpring.Entidades;

import java.time.LocalDate;

public class UsuarioR {

    private int id;
    private String nombre;
    private String pais;
    private LocalDate fecha;
    private String correo;

    public UsuarioR(int id, String nombre, String pais, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
    }

    //Getter

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    //Setter


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
