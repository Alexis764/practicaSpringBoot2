$(document).ready(function() {


   //Lista datos
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

   
    //Agregar dato
    $('#enviarC').on('click',function(){
        let datos = {
           cedula: parseInt($('#cedula').val()),
           nombre: $('#nombre').val(),
           apellido: $('#apellido').val(),
           numero: parseInt($('#numero').val()),
           correo: $('#correo').val()
        }
        console.log(datos)
  
        //Convertirlo realmente en formato JSON
        let datosEnvio = JSON.stringify(datos)
  
        $.ajax({
           url:"http://localhost:8080/agregarCliente",
           type: "POST",
           data: datosEnvio,
           contentType: "application/JSON",
           dataType: "TEXT",
           success: function(respuesta){
              alert(respuesta);
           }
  
        });
  
     });

     //Buscar dato Cedula
     $('#btnbuscar').on('click',function(){
      let cedula = $('#numCedula').val();
      
      $.ajax({
         url: "http://localhost:8080/buscarCliente/"+cedula,
         type: "GET",
         dataType: "JSON",
         success: function(respuesta){
            console.log(respuesta)

            if(respuesta != null){
               $('#busqueda').append("Cliente: </br>Nombre: "+respuesta.nombre+
               "</br>Apellido: "+respuesta.apellido +
               "</br>Numero: "+respuesta.numero +
               "</br>Correo: "+respuesta.correo)
            }else{
               alert("El cliente no se encontro!")
            }
         }
      })

     })

     //Buscar dato Nombre
     $('#btnbuscar2').on('click',function(){
      let nombre = $('#busqNombre').val();
      let busqueda = document.querySelector('#busqueda')
      busqueda.innerHTML = '<div></div>'
      
      $.ajax({
         url: "http://localhost:8080/buscarnomCliente/"+nombre,
         type: "GET",
         dataType: "JSON",
         success: function(respuesta){
            console.log(respuesta)

            if(respuesta != null){
               $("#busqueda").append("Cliente: </br>")
               for(i = 0; i<= respuesta.length; i++){
                  $('#busqueda').append("Nombre: "+respuesta[i].nombre+
                  "</br>Apellido: "+respuesta[i].apellido +
                  "</br>Numero: "+respuesta[i].numero +
                  "</br>Correo: "+respuesta[i].correo + "</br></br>")
               }
            }else{
               alert("El cliente no se encontro!")
            }
         }
      })
     })

     //Eliminar cliente
     $('#btnbuscar3').on('click',function(){
         let cedulaEliminar = $('#numCedula').val();
         $.ajax({
            url:"http://localhost:8080/eliminarCliente/"+cedulaEliminar,
            type: "DELETE",
            dataType: "TEXT",
            success: function(respuesta){
               alert(respuesta)
            }
         })
     })

     $('#modificar').on('click',function(){
      let datos = {
         cedula: parseInt($('#cedula').val()),
         nombre: $('#nombre').val(),
         apellido: $('#apellido').val(),
         numero: parseInt($('#numero').val()),
         correo: $('#correo').val()
      }

      let datosEnvio = JSON.stringify(datos)

      $.ajax({
         url:"http://localhost:8080/modificarCliente",
         type: "POST",
         data: datosEnvio,
         contentType: "application/JSON",
         dataType: "TEXT",
         success: function(respuesta){
            alert(respuesta);
         }

      });

   });

});