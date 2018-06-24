<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="jspf/cabecalho.jspf" %>
    <body>
        <div class="container text-center">
            <c:choose>
                <c:when test="${login}">
                    <form method="post">
                        <div class="form-group row">
                            <label>Login</label>
                            <input type="email" class="form-control" name="loginUsuario" placeholder="Seu Login" required>
                            <label>Senha</label>
                            <input type="password" class="form-control" name="senhaUsuario" size="20" placeholder="Sua senha" required>
                            <input type="submit" class="btn btn-success"/>
                            <input type="reset" class="btn btn-secondary"/>
                        </div>
                    </form>
                </c:when>
                <c:when test="${!login}">
                    <h5> <font color="FF0000"> E-mail e/ou senha incorreto(s)! </font> </h5>
                    <form method="post">
                        <div class="form-group row">
                            <label>Login</label>
                            <input type="email" class="form-control" name="loginUsuario" placeholder="Seu Login" required>
                            <label>Senha</label>
                            <input type="password" class="form-control" name="senhaUsuario" size="20" placeholder="Sua senha" required>
                            <input type="submit" class="btn btn-success"/>
                            <input type="reset" class="btn btn-secondary"/>
                        </div>
                    </form>
                </c:when>
            </c:choose>
        </div>
<%@include file="jspf/rodape.jspf" %>