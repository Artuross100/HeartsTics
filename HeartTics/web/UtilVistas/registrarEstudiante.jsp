<%-- 
    Document   : registrarEstudiante
    Created on : 12-oct-2016, 16:30:30
    Author     : estudiante
--%>

<%@page import="java.text.ParseException"%>
<%@page import="java.util.Date"%>
<%@page import="javax.print.attribute.Size2DSyntax.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="controlador" scope="session" class="Controlador.Servicio" />
<%
    request.setCharacterEncoding("UTF-8");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String tipoDoc = request.getParameter("tipoDoc");
    String numDoc = request.getParameter("numDoc");
    String correo = request.getParameter("correo");
    String fechaNacimiento = request.getParameter("fechaNacimiento");
    String tipoSangre = request.getParameter("tipoSangre");
    String ciudadNacimiento = request.getParameter("ciudadNacimiento");
    String departamentoNacimiento = request.getParameter("departamentoNacimiento");
    String paisNacimiento = request.getParameter("paisNacimiento");
    String ciudadActual = request.getParameter("ciudadActual");
    String departamentoActual = request.getParameter("departamentoActual");
    String paisActual = request.getParameter("paisActual");
    String genero = request.getParameter("genero");
    String eps = request.getParameter("eps");
    String telefono = request.getParameter("telefono");
    String usuario = request.getParameter("usuario");
    String contra = request.getParameter("contra");
    int grupo = Integer.parseInt(request.getParameter("grupo"));

    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
    Date fecha = null;
    try {

        fecha = formatoDelTexto.parse(fechaNacimiento);
        boolean es = controlador.registrarUsuario(Integer.parseInt(tipoDoc), numDoc, correo, fecha,
                tipoSangre, ciudadActual, departamentoActual, genero, eps,
                nombre, apellido, telefono, ciudadNacimiento, departamentoNacimiento,
                paisNacimiento, paisActual, usuario, contra, grupo);
        if (!es) {
%>
<script text="javascript">
    alert("Registro exitoso");
    window.location.href = "../Vistas/registrarEstudiante.jsp"
</script>
<%
} else {%>
<script text="javascript">
    alert("No se puede registrar el estudiante, revise que los datos sean validos");
    window.location.href = "../Vistas/registrarEstudiante.jsp"
</script>
<%

        }

    } catch (ParseException ex) {

        ex.printStackTrace();

    }

%>
