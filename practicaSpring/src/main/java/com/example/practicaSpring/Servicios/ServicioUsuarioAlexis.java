package com.example.practicaSpring.Servicios;

import com.example.practicaSpring.Entidades.UsuarioAlexis;
import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioUsuarioAlexis {

    ArrayList<UsuarioAlexis> lista = new ArrayList<>();

    public ServicioUsuarioAlexis() {
        lista.add(new UsuarioAlexis(10, "Luisa", "Alemania", LocalDate.of(2023, 02, 28), "luisa@gmail.com"));
        lista.add(new UsuarioAlexis(11, "Alberto", "Francia", LocalDate.of(2020, 05, 14), "alberto@gmail.com"));
        lista.add(new UsuarioAlexis(12, "Pedro", "España", LocalDate.of(2019, 04, 16), "pedro@gmail.com"));
    }

    public ArrayList<UsuarioAlexis> listar() {
        return lista;
    }

}
