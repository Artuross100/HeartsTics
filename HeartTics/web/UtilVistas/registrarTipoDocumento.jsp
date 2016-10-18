<%-- 
    Document   : registrarTipoDocumento
    Created on : 16/10/2016, 09:25:33 AM
    Author     : Andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="page" class="Controlador.Servicio" />

<!DOCTYPE html>
<%
    String nombre =  request.getParameter("nombre");
    boolean a = controlador.registrarDocumento(nombre);
    if(!a){%>
    <script type="text/javascript">
        alert("Registro exitoso");
    </script>
    <%}else{%>
    <script type="text/javascript">
        alert("Error al intentar registrar");
    </script>
    <%}%>
    <script type="text/javascript">
        window.location.href="../Vistas/gestionarTipoDocumento.jsp";
    </script>