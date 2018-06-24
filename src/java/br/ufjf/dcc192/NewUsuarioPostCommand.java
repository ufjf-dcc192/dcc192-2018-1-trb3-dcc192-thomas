package br.ufjf.dcc192;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewUsuarioPostCommand implements Comando{

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioDAO usuario = new UsuarioDAO();
        
        String nomeUsuario = request.getParameter("nomeUsuario");
        String loginUsuario = request.getParameter("loginUsuario");
        String senhaUsuario = request.getParameter("senhaUsuario");
        String emailUsuario = request.getParameter("emailUsuario");
    }
    
}
