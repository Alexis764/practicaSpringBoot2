package com.example.practicaSpring.Servicios;

import com.example.practicaSpring.Entidades.UsuarioR;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuarioR {

    ArrayList<UsuarioR> lista = new ArrayList<>();

    public servicioUsuarioR(){
        lista.add(new UsuarioR(10,"Sofia","Mexico", LocalDate.of(2001,9,03),"sofia@gmail.com"));
        lista.add(new UsuarioR(11,"Mateo","Italia", LocalDate.of(2005,12,18),"mateo12@gmail.com"));
        lista.add(new UsuarioR(12,"Marcus","Argentina", LocalDate.of(2000,11,21),"marcus21@gmail.com"));
    }

    public ArrayList<UsuarioR> listar(){
        return lista;
    }

    public String agregarUsuario(UsuarioR usu){
        lista.add((usu));
        return "Registro Exitoso";
    }

}
