<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="jspf/cabecalho.jspf" %>
    <body>
        <div class="container text-center">                          
                    <form method="POST">
                        <div class="form-group row">
                            <label>Nome</label>
                            <input type="text" class="form-control" name="nomeUsuario" size="20" placeholder="Seu nome" required>
                            <label>Login</label>
                            <input type="login" class="form-control" name="loginUsuario" placeholder="Seu Login" required>
                            <label>Email</label>
                            <input type="email" class="form-control" name="emailUsuario" placeholder="Seu e-mail" required>
                            <label>Senha</label>
                            <input type="password" class="form-control" name="senhaUsuario" size="20" placeholder="Sua senha" required>

                            <input type="submit" class="btn btn-success"/>
                            <input type="reset" class="btn btn-secondary"/>
                        </div>
                    </form>           
        </div>
<%@include file="jspf/rodape.jspf" %>