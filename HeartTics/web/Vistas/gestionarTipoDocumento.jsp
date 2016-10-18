<%-- 
    Document   : gestionarTipoDocumento
    Created on : 15/10/2016, 08:38:49 PM
    Author     : Andrea
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ClasesDTO.TipoDocumento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="controlador" scope="session" class="Controlador.Servicio" />

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
        <%
            ArrayList<TipoDocumento> documentos = controlador.cargarDocumentos();
        %>
        <div class="row">
            <div class="col-md-6 col-md-offset-4">
                <h1>Registrar Tipo de Documento</h1>
            </div>
        </div>
        <form action="../UtilVistas/registrarTipoDocumento.jsp" method="post" id="frmRegistrarTipoDoc" class="form-inline">
            <div class="row">
                <div class="col-md-7 col-md-offset-3">
                    <div class="form-group">
                        <label for="exampleInputName2">Nombre del Documento</label>
                        <input type="text" name="nombre" value="" class="form-control" placeholder="Ej. Cedula de ciudadanía" required/>
                        <button type="submit" class="btn btn-success">Registrar</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-md-offset-4"><h1>Documentos Disponibles</h1></div>
                </div>
            </div>
            <div class="col-md-7 col-md-offset-3">
                <div class="table-responsive">
                    <form id="frmEliminarTipoDoc" action="../UtilVistas/eliminarTipoDoc.jsp" method="post">
                        <table class="table table-hover">
                            <tr>
                                <th>Tipo de Documento</th>
                                <th>Eliminar</th>
                            </tr>
                            <%for (TipoDocumento e : documentos) {%>
                            <tr>
                                <td><%=e.getNombreDoc()%></td>
                                <td><div class="checkbox">
                                        <label>
                                            <input name="eliminar" type="checkbox" value="<%=e.getIdTipoDoc()%>"/> Eliminar
                                        </label>
                                    </div></td>

                            </tr>
                            <%}%>
                        </table>
                        <input type="submit" name="guardarCambios" value="Eliminar" class="btn btn-warning"/>Eliminar
                    </form>
                </div>
            </div>
        </form>
    </body>
</html>
