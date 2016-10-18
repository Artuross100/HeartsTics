<%-- 
    Document   : registrarDocente
    Created on : 15/10/2016, 08:40:03 PM
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
            <div class="col-md-6 col-md-offset-4"><h1>Registrar Docentes</h1></div>
        </div>


        <form id="frmRegistrarEstudiante" action="../UtilVistas/registrarDocente.jsp">

            <div class="row">
                <div class="col-xs-6 col-sm-4">
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" name="nombre" value="" class="form-control" placeholder="Nombre" required/>
                    </div>
                    <div class="form-group">
                        <label>Apellido</label>
                        <input type="text" name="apellido" value="" class="form-control" placeholder="Apellido" required/>
                    </div>
                    <div class="form-group">
                        <label>Tipo de Documento</label>
                        <select name="tipoDoc" class="form-control">
                            <option value="">Seleccione el tipo de documento</option>
                            <%for (TipoDocumento t : documentos) {
                            %><option value="<%=t.getIdTipoDoc()%>"><%=t.getNombreDoc()%></option>
                            <%
                                }
                            %>

                        </select>
                    </div>
                    <div class="form-group">
                        <label>Número De Documento</label>
                        <input type="text" name="numDoc" value="" placeholder="Número de Documento" class="form-control" required/>
                    </div>
                    <div class="form-group">
                        <label>Correo Electrónico</label>
                        <input type="email" name="correo" value="" placeholder="Correo Electrónico" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>Fecha de Nacimiento</label>
                        <input type="date" name="fechaNacimiento" value="" class="form-control" />
                    </div>
                </div>
                <div class="col-xs-6 col-sm-4">
                    <div class="form-group">
                        <label>Tipo de Sangre</label>
                        <select name="tipoSangre"  class="form-control">
                            <option value="">Seleccione el tipo de sangre</option>
                            <option value="A+">A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Ciudad de Nacimiento</label>
                        <input type="text" name="ciudadNacimiento" value="Cúcuta" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Departamento de Nacimiento</label>
                        <input type="text" name="departamentoNacimiento" value="Norte de Santander" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Pais de Nacimiento</label>
                        <input type="text" name="paisNacimiento" value="Colombia" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Ciudad Actual</label>
                        <input type="text" name="ciudadActual" value="Cúcuta" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Departamento Actual</label>
                        <input type="text" name="departamentoActual" value="Norte de Santander" class="form-control" />
                    </div>
                </div>
                <div class="col-xs-6 col-sm-4">
                    <div class="form-group">
                        <label>Pais Actual</label>
                        <input type="text" name="paisActual" value="Colombia" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Género</label>
                        <select name="genero"  class="form-control">
                            <option value="">Seleccione el género del estudiante</option>
                            <option value="Femenino">Femenino</option>
                            <option value="Masculino">Masculino</option>
                            <option value="Otro">Otro</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>EPS o ARS</label>
                        <input type="text" name="eps" value="" class="form-control" placeholder="EPS o ARS afiliado" />
                    </div>
                    <div class="form-group">
                        <label>Teléfono</label>
                        <input type="text" name="telefono" value="" class="form-control" placeholder="3001234567-5802222" />
                    </div>
                    <div class="form-group">
                        <label>Usuario</label>
                        <input type="text" name="usuario" value="" class="form-control" placeholder="Nombre de usuario" />
                    </div>
                    <div class="form-group">
                        <label>Contraseña</label>
                        <input type="password" name="contra" value="" class="form-control" placeholder="Mínimo 6 carácteres" />
                    </div>
                </div>
                <div class="clear-fix"></div>
                <div class="row">
                    <div class="col-md-3 col-md-offset-5"><input type="submit" value="Registrar" class="btn btn-success btn-lg"/></div>
                </div> 
            </div>

        </form>
    </body>
</html>
