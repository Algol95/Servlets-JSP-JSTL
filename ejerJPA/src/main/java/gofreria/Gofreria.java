package gofreria;

import aplicacion.model.Gofre;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gofreria
 */
@WebServlet("/Gofreria")
public class Gofreria extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Gofre> gofreria;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gofreria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("PruebaGofreria.jsp");
		rellenarDatos();
		request.setAttribute("gofres", gofreria);
		rd.forward(request, response);
	}
	
	private void rellenarDatos() {
		gofreria = new ArrayList<Gofre>();
		gofreria.add(new Gofre("Puro cacao","Crema de chocolate", "Chocolate", 5));
		gofreria.add(new Gofre("Caribe","Crema de leche de coco", "Chocolate y virutas de coco", 10));
		gofreria.add(new Gofre("Negro y Blanco","Crema de chocolate blanco", "Chocolate negro", 3));
		gofreria.add(new Gofre("Blanco y Negro","Crema de chocolate negro", "Chocolate blanco", 4));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
