package edu.infnet.br.app.contatos;

import edu.infnet.br.domain.contatos.Endereco;
import edu.infnet.br.infra.contatos.EnderecoService;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EnderecoController", value = "/EnderecoController")
public class EnderecoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cep = request.getParameter("cep");

        if (StringUtils.isNotBlank(cep)){

            EnderecoService es = new EnderecoService();
            Endereco end = es.obterPorCep(cep);
            request.setAttribute("endereco", end);

        } else{

            request.setAttribute("erro", "CEP Inválido");
        }
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);


    }
}
