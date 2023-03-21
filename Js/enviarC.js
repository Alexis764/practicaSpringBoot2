$(document).ready(function() {

    $('#listar').on('click', function(){
       let tabla = document.querySelector('#tabla')
       tabla.innerHTML = '<thead>'+ 
       '<th>Cedula</th>'+
       '<th>Nombre</th>'+
       '<th>Apellido</th>'+
       '<th>Numero</th>'+
       '<th>Correo</th>'+
       '</thead>';
 
       $.ajax({
          url:"http://localhost:8080/listarClientes",
          type: "GET",
          dataType: "JSON",
          success:function(respuesta){
             console.log(respuesta);
             for(i = 0; i <= respuesta.length; i++){
                tabla.innerHTML += '<tr><td>'+ respuesta[i].cedula +
                   '<td>' + respuesta[i].nombre +
                   '<td>' + respuesta[i].apellido + 
                   '<td>' + respuesta[i].numero +
                   '<td>' + respuesta[i].correo
                }
            }
 
        });
 
    });


    $('#enviar').on('click',function(){
        let datos = {
           id: parseInt($('#cedula').val()),
           nombre: $('#nombre').val(),
           pais: $('#apellido').val(),
           fecha: parseInt($('#celular').val()),
           correo: $('#correo').val()
        }
        console.log(datos)
  
        //Convertirlo realmente en formato JSON
        let datosEnvio = JSON.stringify(datos)
        console.log(datosEnvio)
  
        $.ajax({
           url:"http://localhost:8080/agregarUsuario",
           type: "POST",
           data: datosEnvio,
           //Es decir que el contenido sera JSON
           contentType: "application/JSON",
           //dataType: "JSON",
           success: function(respuesta){
              alert(respuesta);
           }
  
        });
  
     });



});