<%-- 
    Document   : registrarEstudiante
    Created on : 12-oct-2016, 16:30:30
    Author     : estudiante
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="controlador" scope="page" class="Controlador.Servicio" />
<%
    String nombre= request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String tipoDoc= request.getParameter("tipoDoc");
    String numDoc= request.getParameter("numDoc");
    String correo= request.getParameter("correo");
    String fechaNacimiento = request.getParameter("fechaNacimiento");
    String tipoSangre= request.getParameter("tipoSangre");
    String ciudadNacimeinto= request.getParameter("ciudadNacimiento");
    String departamentoNacimiento= request.getParameter("departamentoNacimiento");
    String paisNacimiento= request.getParameter("paisNacimiento");
    String ciudadActual= request.getParameter("ciudadActual");
    String departamentoActual= request.getParameter("departamentoActual");
    String paisActual= request.getParameter("paisActual");
    String genero= request.getParameter("genero");
    String eps= request.getParameter("eps");
    String telefono= request.getParameter("telefono");
    String usuario= request.getParameter("usuario");
    String contra= request.getParameter("contra");
    
    
    
%>
<%=fechaNacimiento%>
