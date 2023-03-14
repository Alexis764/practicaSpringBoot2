package com.example.practicaSpring.Servicios;

import com.example.practicaSpring.Entidades.ProductosR;

import java.util.ArrayList;

public class servicioProductosR {

    private ArrayList<ProductosR> lista = new ArrayList<>();

    public servicioProductosR(){
        lista.add(new ProductosR(1,50,"Manzana","Fruta",5200.0,0));
        lista.add(new ProductosR(2,50,"Papa","Vegetales",2200.0,0));
        lista.add(new ProductosR(3,50,"Fresa","Fruta",4600.0,0));
        lista.add(new ProductosR(4,50,"Jabon de baño","Aseo",10300.0,0));
        lista.add(new ProductosR(5,50,"Frijol","Grano",10400.0,0));
    }

    public ArrayList<ProductosR> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<ProductosR> precioProductos() {
        for (ProductosR producto: lista) {
            producto.setTotal(producto.getCantidad() * producto.getPrecio());
        }
        return lista;
    }

    public double totalProductos() {
        int total = 0;
        for (ProductosR producto: lista) {
            total += producto.getTotal();
        }
        return total;
    }

}
