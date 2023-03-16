$(document).ready(function() {
   //alert("holaaa")
   $('#listar').on('click', function(){
      let tabla = document.querySelector('#tabla')
      tabla.innerHTML = '<thead>'+ 
      '<th>Codigo</th>'+
      '<th>Nombre</th>'+
      '<th>Pais</th>'+
      '<th>Fecha</th>'+
      '<th>Correo</th>'+
      '</thead>';

      //Traer datos ya hechos en un JSON

      $.ajax({
         //url:"datos.json",
         url:"http://localhost:8080/listarUsuario",
         type: "GET",
         dataType: "JSON",
         success:function(respuesta){
            console.log(respuesta);
            for(i = 0; i <= respuesta.length; i++){
               tabla.innerHTML += '<tr><td>'+ respuesta[i].id +
                  '<td>' + respuesta[i].nombre +
                  '<td>' + respuesta[i].pais +
                  '<td>' + respuesta[i].fecha + 
                  '<td>' + respuesta[i].correo
            }
         }

      });

   });
   
   //Traer datos mediante un form

   $('#enviar').on('click',function(){
      let datos = {
         id: parseInt($('#numID').val()),
         nombre: $('#nombre').val(),
         pais: $('#pais').val(),
         fecha: $('#fecha').val(),
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
         dataType: "JSON",
         success: function(respuesta){
            console.log(respuesta);
         }

      });

   });

});