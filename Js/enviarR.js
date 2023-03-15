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

});