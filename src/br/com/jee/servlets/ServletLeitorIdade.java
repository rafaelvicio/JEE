package br.com.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLeitorIdade
 */
@WebServlet(
		name = "ServletLeitorIdade",
		urlPatterns = {"/LerIdade"}
)
public class ServletLeitorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletContext contexto;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLeitorIdade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		contexto = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idade = Integer.parseInt(request.getParameter("idade"));
		contexto.setAttribute("idadeUsuario", idade);
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Verificação da idade</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
			response.getWriter().println("<form method='post' action='confirmaIdade' >");
			response.getWriter().println("<h1>Confirme sua idade</h1>");
			response.getWriter().println("<input type='text' name='idadeConfirmada' />");
			response.getWriter().println("<input type='submit' value='Confirmar'>");
			response.getWriter().println("</form>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}

}
