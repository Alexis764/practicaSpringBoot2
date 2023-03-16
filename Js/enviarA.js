$(document).ready(function(){

    $('#listar').on('click', function() {

        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '<thead><th class="titleTabla">Codigo<th class="titleTabla">Nombre<th class="titleTabla">Pais<th class="titleTabla">Fecha<th class="titleTabla">Correo'


        $.ajax({
            
            url: "http://localhost:8080/listarUsuarioA",
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {

                for (i=0; i <= respuesta.length; i++) {

                    tabla.innerHTML += '<tr><td>' + respuesta[i].idUsuario + 
                    '<td>' + respuesta[i].nombre +
                    '<td>' + respuesta[i].pais +
                    '<td>' + respuesta[i].fechaNacimiento +
                    '<td>' + respuesta[i].correo

                }
    
            }

        });

    });


    $('#enviar').on('click', function() {

        let datos = {
            idUsuario: parseInt($('#idUsuario').val()),
            nombre: $('#nombre').val(),
            pais: $('#pais').val(),
            fechaNacimiento: $('#fechaNacimiento').val(),
            correo: $('#correo').val()
        }
        
        let datosEnvio =  JSON.stringify(datos);
        
        $.ajax({
        
            url: "http://localhost:8080/agregarUsuarioA",
            type: "POST", 
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                
            }

        });

    });


});