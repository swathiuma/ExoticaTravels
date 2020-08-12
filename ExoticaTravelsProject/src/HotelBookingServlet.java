

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
		urlPatterns = { "/HotelBookingServlet" }, 
		initParams = { 
				@WebInitParam(name = "HotelNames", value = "Select,Jetwing,Kells,Heritance,Devon,Hiliton")
		})
public class HotelBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public HotelBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out=response.getWriter();
    	HttpSession session=request.getSession();
    	String hotelNames=this.getInitParameter("HotelNames");
    	String hotelNamesSplit[]=hotelNames.split(",");
    	try{
    		String destination=request.getParameter("destination");
    		session.setAttribute("destination", destination);
    		out.println("<title>Tour Package Booking Page</title>");
    		out.println("<div align='right'>");
    		out.println("<a href='LogoutServlet'>Logout</a>");
    		out.println("</div>");
    		out.println("<table>");
    		out.println("<form action='CabBookingServlet'>");
    		out.println("<tr><td><h3>Tour Package Booking</h3></td></tr>");
    		out.println("<tr><td>Select a hotel</td>");
    		out.println("<td><select name='hotel'>");
    		for(int i=0;i<hotelNamesSplit.length;i++)
    		out.println("<option value='"+hotelNamesSplit[i]+"'>"+hotelNamesSplit[i]+"</option>");
    		out.println("</select></h1></td>");
    		out.println("<tr><td>Number of days</td>");
    		out.println("<td><input type='text' name='noofdays'></td></tr>");
    		out.println("<tr><td><input type='submit' value='Next'></td></tr>");
    		out.println("</form>");
    		out.println("<form action='TourPackagePage.jsp'>");
    		out.println("<td><input type='submit' value='Back'></td></tr>");
    		out.println("</form>");
    		out.println("</table>");
    	}
    	finally{
    		out.close();
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
		}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
