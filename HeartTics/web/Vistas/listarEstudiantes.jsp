<%-- 
    Document   : listarEstudiantes
    Created on : 13-oct-2016, 16:29:08
    Author     : Estudiante
--%>

<%@page import="ClasesDTO.Estudiante"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Versión compilada y comprimida del CSS de Bootstrap -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
        <!-- Tema opcional -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap-theme.min.css">
        <!-- Versión compilada y comprimida del JavaScript de Bootstrap -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <title>Hearts Tics</title>
    </head>
    <body>
        <jsp:useBean id="controlador" scope="session" class="Controlador.Servicio"/>
        <%
            ArrayList<Estudiante> estudiantes = controlador.listarEstudiantes();
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
                    <th>Curso</th>
                    <th>Correo</th>
                </tr>
                <%for(Estudiante e:estudiantes){%>
                <tr>
                    <td><%=e.getTipoDoc().getNombreDoc()%></td>
                    <td><%=e.getNumDoc()%></td>
                    <td><%=e.getNombres()+" "+e.getApellidos()%></td>
                    <td><%=e.getUsuario()%></td>
                    <%if(e.getCurso()!=0){%>
                    <td><%=e.getGrupo()+" "+e.getCurso()%></td>
                    <%}else{%>
                        <td>No está asignado a ningún grupo</td>
                    <%}%>
                    <th><%=e.getCorreo()%></th>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>
