

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Payments
 */
@WebServlet("/Payments")
public class Payments extends HttpServlet 
{
	static String output="";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payments() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID, FName, LName, card;
		
    	ID= request.getParameter("ID");
    	FName=request.getParameter("FName");
    	LName = (String)request.getParameter( "LName" );
    	card=request.getParameter("number");
    	
    	output+="<table border=1 color=white bgcolor=white>";
    	output+="<tr><th>Input Confirmation</th></tr> ";
    	output+=ID;
    	output+= FName;
    	output+= LName;
    	output+= card;
    					
    	request.setAttribute("Message", output);
		getServletContext().getRequestDispatcher("/Output.jsp").forward(request,response);
   
	}

}
