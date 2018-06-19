package dcc192.ufjf.br;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SistemaServlet", urlPatterns = {"/sistema", "/index.html", "/usuario-novo.html", "/login.html", "/logout.html", "/item-novo.html","/item-editar.html","/item-listar.html","/item-excluir.htmml",""})
public class SistemaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
