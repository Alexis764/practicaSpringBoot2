package com.example.practicaSpring.Entidades;


public class ProductosAlexis {

    //Atributos
    private int codigoPro, cantidadPro;
    private String nombrePro, categoriaPro;
    private double precioPro, totalPro;


    //Constructor
    public ProductosAlexis(int codigoPro, int cantidadPro, String nombrePro, String categoriaPro, double precioPro, double totalPro) {
        this.codigoPro = codigoPro;
        this.cantidadPro = cantidadPro;
        this.nombrePro = nombrePro;
        this.categoriaPro = categoriaPro;
        this.precioPro = precioPro;
        this.totalPro = totalPro;
    }


    //Getters
    public int getCodigoPro() {
        return codigoPro;
    }

    public int getCantidadPro() {
        return cantidadPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public String getCategoriaPro() {
        return categoriaPro;
    }

    public double getPrecioPro() {
        return precioPro;
    }

    public double getTotalPro() {
        return totalPro;
    }


    //Setters
    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public void setCantidadPro(int cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public void setCategoriaPro(String categoriaPro) {
        this.categoriaPro = categoriaPro;
    }

    public void setPrecioPro(double precioPro) {
        this.precioPro = precioPro;
    }

    public void setTotalPro(double totalPro) {
        this.totalPro = totalPro;
    }
}
