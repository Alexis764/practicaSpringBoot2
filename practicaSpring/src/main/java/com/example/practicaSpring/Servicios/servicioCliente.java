package com.example.practicaSpring.Servicios;

import ch.qos.logback.core.net.server.Client;
import com.example.practicaSpring.Entidades.Cliente;

import java.util.ArrayList;

public class servicioCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public servicioCliente(){
        clientes.add(new Cliente(100323,"Santiago","Rodriguez", 30193284,"santirodri@gmail.com"));
        clientes.add(new Cliente(102141,"Carlos","Marcelo", 30132141,"carlosmarc2@gmail.com"));
        clientes.add(new Cliente(112415,"Marcelo","Martinez", 30213124,"marc02@gmail.com"));
        clientes.add(new Cliente(154353,"Dereck","Lopez", 303124123,"dereck14@gmail.com"));
    }

    public ArrayList<Cliente> listaclientes() {
        return clientes;
    }
}
