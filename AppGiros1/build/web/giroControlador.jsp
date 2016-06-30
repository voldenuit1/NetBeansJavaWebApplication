<%-- 
    Document   : GiroControlador
    Created on : 28-may-2016, 11:47:28
    Author     : VoldeNuit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% String nombre = new String(request.getParameter("nombre")); %>

<% String nombreDestinatario = new String(request.getParameter("nombreDestinatario")); %>

<%String lugarDestino = new String (request.getParameter("lugarDestino"));%>

<% String monto = new String(request.getParameter("monto"));int value = Integer.valueOf(monto);%>

<% String tipoCambio = new String(request.getParameter("tipoCambio"));

    int valor;
    int montox;
    double valorTotal;
    montox = Integer.parseInt(monto);
    //si tipoCambio es igual a la opcion dolar, el valor es igual a el monto x 500
    if (tipoCambio == "dolar") {
        valor = montox * 500;
    //si no entonces el valor es igual al monto x 600 lo que seria el euro por defecto
    } else {
        valor = montox * 600;
    }
    //el valor total es igual al monto ingresado por el valor de la moneda mas la comision de 1.02%
    valorTotal = valor * 1.02;

%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comprobante de giro</title>
        <link rel="stylesheet" type="text/css"href="EstilosAppGiros1/GirosGet.css">
    </head>
    <body>
        <h1>Giro Express</h1> 
        
        <table  border="1"> 
         <th>COMPROBANTE DE ENVÍO</th>   
            <tr>
                <td><h4>Envía:</td><td> <%= nombre %></h4></td>
            </tr>
            <tr>
                <td><h4>Recibe:</td><td> <%= nombreDestinatario %></h4></td>
            </tr>
            <tr>
                <td><h4>Monto:</td><td> <%= monto %></h4></td>
            </tr>
            <tr>
                <td><h4>Cambio: </td><td><%= tipoCambio %></h4></td>
            </tr>
            <tr>
                <td><h4>Valor moneda: </td><td><%= valor %></h4></td>
            </tr>
            <tr>
                <td><h4>Total(Valor moneda+comision:</td><td> <%= valorTotal %></h4></td>
            </tr>    
        </table>
       
        <h2>Gracias por su preferencia</h2>
        <center>
            &copy;Copyright 2016. JFSA. Todos Los derechos Reservados. | <span>Vol de Nuit</span>
            <a href="https://www.facebook.com/Vuelonocturno1.0"> facebook.com </a>
        </center>
        
    </body>
</html>
