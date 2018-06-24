<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="jspf/cabecalho.jspf" %>
<p><h2>Opções</h2></p>
<form method="POST" action="index.html">
    <table border="1">
        <tbody>                                                                       
            <a type="button" class="btn btn-primary btn-lg" href="item-editar.html">Listar Items</a>
            <a type="button" class="btn btn-primary btn-lg" href="item-editar.html">Novo Item</a>
            <a type="button" class="btn btn-primary btn-lg" href="item-editar.html">Fazer cadastro</a>                                 
        </tbody>
        
    </table>
    <%@include file="jspf/rodape.jspf" %>