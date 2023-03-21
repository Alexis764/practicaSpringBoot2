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
            dataType: "TEXT",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });



    $('#buscarCodigoPro').on('click', function() {
        
        let tabla = document.querySelector('#tablaBuscarCodigoPro')
        tabla.innerHTML = '<thead><th class="titleTabla" colspan="6">PRODUCTOS<thead><th class="titleTabla">Codigo<th class="titleTabla">Cantidad<th class="titleTabla">Nombre<th class="titleTabla">Categoria<th class="titleTabla">Precio<th class="titleTabla">Total'

        let codigoPro = $('#codigoProHtmlBuscar').val();
        $.ajax({

            url: "http://localhost:8080/buscarCodigoProA/" + codigoPro,
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {

                tabla.innerHTML += '<tr><td>' + respuesta.codigoPro + 
                    '<td>' + respuesta.cantidadPro +
                    '<td>' + respuesta.nombrePro +
                    '<td>' + respuesta.categoriaPro +
                    '<td>' + respuesta.precioPro +
                    '<td>' + respuesta.totalPro

            }

        });

    });


    
    $('#buscarCategoriaPro').on('click', function() {
        
        let tabla = document.querySelector('#tablaBuscarCategoriaPro')
        tabla.innerHTML = '<thead><th class="titleTabla" colspan="6">PRODUCTOS<thead><th class="titleTabla">Codigo<th class="titleTabla">Cantidad<th class="titleTabla">Nombre<th class="titleTabla">Categoria<th class="titleTabla">Precio<th class="titleTabla">Total'

        let categoriaPro = $('#categoriaProHtmlBuscar').val();
        $.ajax({

            url: "http://localhost:8080/buscarCategoriaProA/" + categoriaPro,
            type: "GET",
            dataType: "JSON",
            success: function(respuesta) {

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



    $('#eliminarCodigoPro').on('click', function() {

        let codigoPro = $('#codigoProHtmlEliminar').val();
        $.ajax({

            url: "http://localhost:8080/eliminarCodigoProA/" + codigoPro,
            type: "GET",
            dataType: "TEXT",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });



    $('#actualizarPro').on('click', function() {

        let datos = {
            codigoPro: parseInt($('#codigoProHtmlActualizar').val()),
            cantidadPro: parseInt($('#cantidadProHtmlActualizar').val()),
            nombrePro: $('#nombreProHtmlActualizar').val(),
            categoriaPro: $('#categoriaProHtmlActualizar').val(),
            precioPro: parseFloat($('#precioProHtmlActualizar').val()),
            totalPro: 0.0
        }
        
        let datosEnvio =  JSON.stringify(datos);
        
        $.ajax({
        
            type: "POST", 
            url: "http://localhost:8080/actualizarProductoA",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "TEXT",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });

});