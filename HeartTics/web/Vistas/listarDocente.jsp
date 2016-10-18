<%-- 
    Document   : listarDocente
    Created on : 18-oct-2016, 16:34:31
    Author     : Estudiante
--%>

<%@page import="ClasesDTO.Docente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- VersiÃ³n compilada y comprimida del CSS de Bootstrap -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
        <!-- Tema opcional -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap-theme.min.css">
        <!-- VersiÃ³n compilada y comprimida del JavaScript de Bootstrap -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <title>Hearts Tics</title>
    </head>
    <body>
        <jsp:useBean id="controlador" scope="session" class="Controlador.Servicio"/>
        <%
            ArrayList<Docente> docentes = controlador.listarDocentes();
        %>
        <div class="row">
            <div class="col-md-3 col-md-offset-4"><h1>Listado de Estudiantes</h1></div>
        </div>
        <div class="table-responsive">
            <table class="table table-hover">
                <tr>
                    <th>Tipo de Documento</th>
                    <th>Número de Documento</th>
                    <th>Nombre</th>
                    <th>Usuario</th>
                    <th>Correo</th>
                </tr>
                <%for (Docente e : docentes) {%>
                <tr>
                    <td><%=e.getTipoDoc().getNombreDoc()%></td>
                    <td><%=e.getNumDoc()%></td>
                    <td><%=e.getNombres() + " " + e.getApellidos()%></td>
                    <td><%=e.getUsuario()%></td>
                    <th><%=e.getCorreo()%></th>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>
