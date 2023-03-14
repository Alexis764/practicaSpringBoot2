package com.example.practicaSpring.Entidades;


public class ProductosAlexis {

    //Atributos
    private int codigo, cantidad;
    private String nombre, categoria;
    private double precio, total;


    //Constructor
    public ProductosAlexis(int codigo, int cantidad, String nombre, String categoria, double precio, double total) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.total = total;
    }


    //Getters
    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return total;
    }


    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
