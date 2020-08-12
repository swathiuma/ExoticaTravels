

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HotelBookingServlet
 */
@WebServlet(
		urlPatterns={"/CabBookingServlet"},
initParams={
		@WebInitParam(name="CabNames", value="Select,Royal,Kangaroo,Derana,ACE,Hiliton")
		})
public class CabBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CabBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	HttpSession session=request.getSession();
    	String cabNames=this.getInitParameter("CabNames");
    	String cabNamesSplit[]=cabNames.split(",");
    	String hotel=request.getParameter("hotel");
    	String noofdays=request.getParameter("noofdays");
    	session.setAttribute("hotel", hotel);
    	session.setAttribute("noofdays", noofdays);
    	System.out.println("cabbookingServlet");
    	try{
    		out.println("<title>Tour Package Booking Page</title>");
    		out.println("<div align='right'>");
    		out.println("<a href='LogoutServlet'>Logout</a>");
    		out.println("</div>");
    		out.println("<table>");
    		out.println("<form action='TourPackageServlet'>");
    		out.println("<tr><td><h3>Tour Package Booking</h3></td></tr>");
    		out.println("<tr><td>Select a Cab Service</td>");
    		out.println("<td><select name='cab'>");
    		for(int i=0;i<cabNamesSplit.length;i++)
    		out.println("<option value='"+cabNamesSplit[i]+"'>"+cabNamesSplit[i]+"</option>");
    		out.println("</select></td></tr>");
    		out.println("<tr><td><input type='submit' value='Submit'></td></tr>");
    		out.println("</form>");
    		out.println("<form action='HotelBookingServlet'>");
    		out.println("<td><input type='submit' value='Back'></td></tr>");
    		out.println("</form>");
    		out.println("</table>");
    	}
    	finally{
    		out.close();
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

}
