
package br.ufjf.dcc192;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Comando{

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("titulo", "Login");
        RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/login.jsp");
        dispacher.forward(request, response);
    }
    
}
