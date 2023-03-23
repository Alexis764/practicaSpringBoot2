package com.example.practicaSpring.Servicios;

import com.example.practicaSpring.Entidades.Cliente;

import java.util.ArrayList;

public class servicioCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public servicioCliente(){
        clientes.add(new Cliente(100323,"Santiago","Rodriguez", 30193284,"santirodri@gmail.com"));
        clientes.add(new Cliente(142353,"Derek","Hail", 301243252,"derekhail@gmail.com"));
        clientes.add(new Cliente(102141,"Carlos","Marcelo", 30132141,"carlosmarc2@gmail.com"));
        clientes.add(new Cliente(112415,"Marcelo","Martinez", 30213124,"marc02@gmail.com"));
        clientes.add(new Cliente(154353,"Derek","Lopez", 303124123,"derek14@gmail.com"));
    }

    //Lista clientes
    public ArrayList<Cliente> listarclientes() {
        return clientes;
    }

    //Agregar cliente
    public String agregarCliente(Cliente cli){
        clientes.add(cli);
        return "Cliente Agregado";
    }

    //Buscar cliente por cedula
    public Cliente buscarCliente(int cedula){
        Cliente cli = null;

        for (Cliente c: clientes){
            if(c.getCedula() == cedula){
                cli = c;
            }
        }
        return cli;
    }

    //Buscar cliente por nombre

    public ArrayList<Cliente> buscarnomCliente(String nombre){
        ArrayList<Cliente> listaNombres = new ArrayList<>();

        for (Cliente x: clientes){
            if(x.getNombre().equals(nombre)){
                listaNombres.add(x);
            }
        }
        return listaNombres;
    }

    //Eliminar Cliente
    public String elimniarCliente(int cedula){

        for (Cliente c: clientes){
            if(c.getCedula() == cedula){
                clientes.remove(c);
                break;
            }
        }
        return "Eliminacion exitosa";
    }

    //Modificar Cliente

    public String modificarCliente(Cliente cliente){
        for (Cliente clienteS : clientes){
            if(clienteS.getCedula() == cliente.getCedula()){
                clienteS.setNombre(cliente.getNombre());
                clienteS.setApellido(cliente.getApellido());
                clienteS.setNumero(cliente.getNumero());
                clienteS.setCorreo(cliente.getCorreo());
            }
        }
        return "Cliente Actualizado";
    }
}
