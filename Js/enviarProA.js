$(document).ready(function(){



    $('#listarPro').on('click', function() {

        let tabla = document.querySelector('#tablaPro')
        tabla.innerHTML = '<thead><th class="titleTabla" colspan="6">PRODUCTOS<thead><th class="titleTabla">Codigo<th class="titleTabla">Cantidad<th class="titleTabla">Nombre<th class="titleTabla">Categoria<th class="titleTabla">Precio<th class="titleTabla">Total'

        $.ajax({
            
            url: "http://localhost:8080/listarProductosAlexis",
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {
                console.log(respuesta);

                for (i=0; i <= respuesta.length; i++) {

                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigoPro + 
                    '<td>' + respuesta[i].cantidadPro +
                    '<td>' + respuesta[i].nombrePro +
                    '<td>' + respuesta[i].categoriaPro +
                    '<td>' + respuesta[i].precioPro +
                    '<td>' + respuesta[i].totalPro

                }
    
            }

        });

    });



    $('#calcularTotalPro').on('click', function() {

        let tabla = document.querySelector('#tablaPro')
        tabla.innerHTML = '<thead><th class="titleTabla" colspan="6">PRODUCTOS<thead><th class="titleTabla">Codigo<th class="titleTabla">Cantidad<th class="titleTabla">Nombre<th class="titleTabla">Categoria<th class="titleTabla">Precio<th class="titleTabla">Total'

        $.ajax({
            
            url: "http://localhost:8080/totalProductoAlexis",
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {
                console.log(respuesta);

                for (i=0; i <= respuesta.length; i++) {

                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigoPro + 
                    '<td>' + respuesta[i].cantidadPro +
                    '<td>' + respuesta[i].nombrePro +
                    '<td>' + respuesta[i].categoriaPro +
                    '<td>' + respuesta[i].precioPro +
                    '<td>' + respuesta[i].totalPro

                }
    
            }

        });

    });



    $('#enviarPro').on('click', function() {

        let datos = {
            codigoPro: parseInt($('#codigoProHtml').val()),
            cantidadPro: parseInt($('#cantidadProHtml').val()),
            nombrePro: $('#nombreProHtml').val(),
            categoriaPro: $('#categoriaProHtml').val(),
            precioPro: parseFloat($('#precioProHtml').val()),
            totalPro: 0.0
        }
        
        let datosEnvio =  JSON.stringify(datos);
        
        $.ajax({
        
            type: "POST", 
            url: "http://localhost:8080/agregarProductoA",
            data: datosEnvio,
            contentType: "application/JSON",
            //dataType: "JSON",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });



    $('#buscar').on('click', function() {
        
        let tabla = document.querySelector('#tablaBuscar')
        tabla.innerHTML = '<thead><th class="titleTabla">Codigo<th class="titleTabla">Nombre<th class="titleTabla">Pais<th class="titleTabla">Fecha<th class="titleTabla">Correo'

        let codigo = $('#idUsuarioBuscar').val();
        $.ajax({

            url: "http://localhost:8080/buscarUsuarioA/" + codigo,
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {

                if (respuesta != null) {
                    tabla.innerHTML += '<tr><td>' + respuesta.idUsuario + 
                    '<td>' + respuesta.nombre +
                    '<td>' + respuesta.pais +
                    '<td>' + respuesta.fechaNacimiento +
                    '<td>' + respuesta.correo

                }

            }

        });

    });


    
});