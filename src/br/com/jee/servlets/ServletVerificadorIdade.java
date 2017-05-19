package br.com.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVerificadorIdade
 */
@WebServlet(
	name = "ServletVerificadorIdade",
	urlPatterns = "/ServletVerificadorIdade",
	initParams = {
			@WebInitParam(name = "empresa", value = "github")
	}
)
public class ServletVerificadorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String empresa = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVerificadorIdade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		empresa = config.getInitParameter("empresa");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		
		int idade = Integer.parseInt(request.getParameter("idade"));
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("	<title>Verificador de Idade Servlet</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("	<h1>Seu nome é: " + nome + "</h1>");
		if(idade >= 18){
			response.getWriter().write("	<h2>voce e maior de idade</h2>");
		}else{
			response.getWriter().write("	<h2>voce e menor de idade</h2>");
		}
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

}
