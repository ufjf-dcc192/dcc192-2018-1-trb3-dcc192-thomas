<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<p><h2>Bem vindo</h2></p>
<form method="POST" action="index.html">
    <table border="1">
        <tbody>
            <tr>
                <td>Email:<input type="text" name="email" value="" size="40" /></td>
            </tr>
            <tr>
                <td>Senha:<input type="password" name="senha" value="" size="40"/></td>
            </tr>
                <tr>
                    <td><input  type="submit" value="Entrar"/></td>
                    
                   <form method="get" action="cadastrar.html">
                        <td><input type="submit" value="Cadastrar"/></td>
                   </form>
                   </tr>        
        </tbody>
        
    </table>