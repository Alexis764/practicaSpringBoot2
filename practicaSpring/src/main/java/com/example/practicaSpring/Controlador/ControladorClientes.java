package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.Cliente;
import com.example.practicaSpring.Servicios.servicioCliente;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorClientes {

    servicioCliente clientes = new servicioCliente();

    //Mostrar lista clientes
    @GetMapping("/listarClientes")
    public ArrayList<Cliente> listarClientes(){
        return clientes.listarclientes();
    }

}
