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



    public String totalProductoAlexis() {
        for (ProductosAlexis producto: lista) {
            producto.setTotalPro(producto.getCantidadPro() * producto.getPrecioPro());
        }

        return "TOTAL CALCULADO\nVUELVA A LISTAR";
    }



    public String agregarProductoAlexis (ProductosAlexis producto) {
        String respuesta;
        boolean encontrado = false;

        for (ProductosAlexis productoIte: lista) {
            if (productoIte.getCodigoPro() == producto.getCodigoPro()) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            respuesta = "PRODUCTO REGISTRADO CON EXITO";
            lista.add(producto);

        } else {
            respuesta = "PRODUCTO YA EXISTENTE\nINGRESE UN CODIGO DIFERENTE";
        }

        return respuesta;
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
        String respuesta;

        if (buscarCodigoProAlexis(codigoPro) != null) {
            lista.remove(buscarCodigoProAlexis(codigoPro));
            respuesta = "PRODUCTO ELIMINADO CON EXITO";

        } else {
            respuesta = "PRODUCTO NO EXISTENTE";
        }

        return respuesta;
    }



    public String actualizarProAlexis (ProductosAlexis producto) {

        String respuesta;
        ProductosAlexis productoAuxiliar = buscarCodigoProAlexis(producto.getCodigoPro());

        if (productoAuxiliar != null) {
            productoAuxiliar.setCantidadPro(producto.getCantidadPro());
            productoAuxiliar.setNombrePro(producto.getNombrePro());
            productoAuxiliar.setCategoriaPro(producto.getCategoriaPro());
            productoAuxiliar.setPrecioPro(producto.getPrecioPro());
            productoAuxiliar.setTotalPro(0.0);

            respuesta = "PRODUCTO ACTUALIZADO";

        } else {
            respuesta = "PRODUCTO NO EXISTENTE";
        }

        return respuesta;
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
