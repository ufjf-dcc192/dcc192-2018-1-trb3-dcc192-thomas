package dcc192.ufjf.br;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SistemaServlet", urlPatterns = {"/sistema", "/index.html", "/usuario-novo.html", "/login.html", "/logout.html", "/item-novo.html","/item-editar.html","/item-listar.html","/item-excluir.htmml",""})
public class SistemaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>();
        rotas.put("/index.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/usuario-novo.html", "br.ufjf.dcc192.ListarEventosCommand");
        rotas.put("/login.html", "br.ufjf.dcc192.EventoNewCommand");
        rotas.put("/logout.html", "br.ufjf.dcc192.InscricaoNewCommand");
        rotas.put("/item-novo.html", "br.ufjf.dcc192.CadastroCommand");
        rotas.put("/item-editar.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/item-listar.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/item-excluir.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/comentar.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/avaliar.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/ranking.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/item.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/item-comentarios.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/meus-comentarios.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/a-avaliar.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/trolls.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/curadores.html", "br.ufjf.dcc192.IndexCommand");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>(); 
    }

}
