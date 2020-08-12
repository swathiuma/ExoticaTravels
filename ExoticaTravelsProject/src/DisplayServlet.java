

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		UserDetailsModel udm=(UserDetailsModel)session.getAttribute("smodel");
		try{
			out.println("<div align='right'>");
			out.println("<a href='LogoutServlet'>Logout</a>");
			out.println("</div>");
			out.println("<h2>Hi "+udm.getUname()+", you have requested for the following bookings</h2>");
			out.println("<h4><br>Destination: "+session.getAttribute("destination"));
			out.println("<br>Hotel: "+session.getAttribute("hotel"));
			out.println("<br>No.of days: "+session.getAttribute("noofdays"));
			out.println("<br>Cab Service: "+session.getAttribute("cab")+"</h4>");
						
		}
		finally{
			out.close();
		}
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
