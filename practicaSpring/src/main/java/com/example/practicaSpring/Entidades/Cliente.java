package com.example.practicaSpring.Entidades;

public class Cliente {

    private int cedula;
    private String nombre;
    private String apellido;
    private int numero;
    private String correo;

    //Constructor

    public Cliente(int cedula, String nombre, String apellido, int numero, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.correo = correo;
    }

    //getter

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    public String getCorreo() {
        return correo;
    }

    //setter
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
