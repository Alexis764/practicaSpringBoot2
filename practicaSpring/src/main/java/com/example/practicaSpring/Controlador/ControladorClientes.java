package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.Cliente;
import com.example.practicaSpring.Servicios.servicioCliente;
import org.springframework.web.bind.annotation.*;

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

    //Agregar cliente
    @PostMapping("/agregarCliente")
    public String agregarCliente (@RequestBody Cliente addcliente){
        return clientes.agregarCliente(addcliente);
    }

    //Buscar cliente por Cedula
    @GetMapping("/buscarCliente/{ced}")
    public Cliente buscarCliente(@PathVariable("ced") int cedula){
        return clientes.buscarCliente(cedula);
    }

    //Buscar cliente por Nombre
    @GetMapping("/buscarnomCliente/{nom}")
    public ArrayList<Cliente> buscarNomCliente(@PathVariable("nom") String nombre){
        return clientes.buscarnomCliente(nombre);
    }

    @DeleteMapping("/eliminarCliente/{ced}")
    public String eliminarCliente(@PathVariable("ced") int cedula){
        return clientes.elimniarCliente(cedula);
    }

    @PostMapping("/modificarCliente")
    public String modificarCliente(@RequestBody Cliente cliente){
        return clientes.modificarCliente(cliente);
    }

}
