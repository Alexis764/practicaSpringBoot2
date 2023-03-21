package com.example.practicaSpring.Servicios;

import com.example.practicaSpring.Entidades.ProductosAlexis;
import java.util.ArrayList;

public class ServicioProductosAlexis {

    private ArrayList<ProductosAlexis> lista = new ArrayList<>();

    public ServicioProductosAlexis() {
        lista.add(new ProductosAlexis(1, 50, "Manzana", "Frutas", 5800.0, 0));
        lista.add(new ProductosAlexis(2, 320, "Papa", "Vegetales", 2500.0, 0));
        lista.add(new ProductosAlexis(3, 210, "Fresa", "Frutas", 4500.0, 0));
        lista.add(new ProductosAlexis(4, 89, "Jabon de baño", "Aseo", 9800.0, 0));
        lista.add(new ProductosAlexis(5, 56, "Frijol", "Grano", 15800.0, 0));
    }



    public ArrayList<ProductosAlexis> mostrarListaProductosAlexis() {
        return lista;
    }



    public ArrayList<ProductosAlexis> totalProductoAlexis() {
        for (ProductosAlexis producto: lista) {
            producto.setTotalPro(producto.getCantidadPro() * producto.getPrecioPro());
        }

        return lista;
    }



    public String agregarProductoAlexis (ProductosAlexis producto) {
        lista.add(producto);
        return "PRODUCTO REGISTRADO";
    }



    public ProductosAlexis buscarCodigoProAlexis(int codigoPro) {
        ProductosAlexis productoAuxiliar = null;

        for (ProductosAlexis producto: lista) {
            if (producto.getCodigoPro() == codigoPro) {
                productoAuxiliar = producto;
                break;
            }
        }

        return productoAuxiliar;
    }



    public ArrayList<ProductosAlexis> buscarCategoriaProAlexis(String categoriaPro) {
        ArrayList<ProductosAlexis> listaAuxiliar = new ArrayList<>();

        for (ProductosAlexis producto: lista) {
            if (producto.getCategoriaPro().equals(categoriaPro)) {
                listaAuxiliar.add(producto);
            }
        }

        return listaAuxiliar;
    }



    public String eliminarCodigoProAlexis(int codigoPro) {

        for (ProductosAlexis producto: lista) {
            if (producto.getCodigoPro() == codigoPro) {
                lista.remove(producto);
                break;
            }
        }

        return "PRODUCTO ELIMINADO";
    }



    public String actualizarProAlexis (ProductosAlexis producto) {

        for (ProductosAlexis productoI: lista) {
            if (productoI.getCodigoPro() == producto.getCodigoPro()) {
                productoI.setCantidadPro(producto.getCantidadPro());
                productoI.setNombrePro(producto.getNombrePro());
                productoI.setCategoriaPro(producto.getCategoriaPro());
                productoI.setPrecioPro(producto.getPrecioPro());
                productoI.setTotalPro(0.0);
            }
        }

        return "PRODUCTO ACTUALIZADO";
    }








    public int cantidadProductos() {
        return lista.size();
    }

    public double totalFinal() {
        int totalFinal = 0;

        for (ProductosAlexis producto: lista) {
           totalFinal += producto.getTotalPro();
        }

        return totalFinal;
    }

}
