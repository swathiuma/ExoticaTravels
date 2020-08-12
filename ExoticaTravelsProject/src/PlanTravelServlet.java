

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/PlanTravelServlet")
public class PlanTravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PlanTravelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    UserDetailsModel udm=new UserDetailsModel();
	String arr_dd,arr_mm,arr_yy,arrDate,dep_dd,dep_mm,dep_yy,depDate;
	String kind_wild,kind_romantic,kind_fun,kind_peaceful,kind_healthy,holidayKind;
	String like_beaches,like_archaeological,like_mountains,like_wildlife,like_fauna,holidayLike;
	String faci_accomodation,faci_food,faci_transport,faci_comm,faci_guide,facilities;
	String budget,standard,star2_3,star4_5,accomodation;
	FileWriter fw;
	BufferedWriter bw;
	HttpSession session;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		session=request.getSession();
		try{
			System.out.println("1_1");
			udm=(UserDetailsModel)session.getAttribute("smodel");
			System.out.println(udm);
			arr_dd=request.getParameter("arr_dd");
			arr_mm=request.getParameter("arr_mm");
			arr_yy=request.getParameter("arr_yy");
			arrDate=arr_dd+"."+arr_mm+"."+arr_yy;
			dep_dd=request.getParameter("dep_dd");
			dep_mm=request.getParameter("dep_mm");
			dep_yy=request.getParameter("dep_yy");
			depDate=dep_dd+"."+dep_mm+"."+dep_yy;
			kind_wild=request.getParameter("kind_wild");
			kind_fun=request.getParameter("kind_fun");
			kind_peaceful=request.getParameter("kind_peaceful");
			kind_healthy=request.getParameter("kind_healthy");
			if(kind_wild!=null)
				holidayKind=kind_wild+",";
			if(kind_romantic!=null)
				holidayKind=kind_romantic+",";
			if(kind_fun!=null)
				holidayKind=kind_fun+",";
			if(kind_peaceful!=null)
				holidayKind=kind_peaceful+",";
			if(kind_healthy!=null)
				holidayKind=kind_healthy+",";
			like_beaches=request.getParameter("like_beaches");
			like_mountains=request.getParameter("like_mountains");
			like_wildlife=request.getParameter("like_wildlife");
			like_fauna=request.getParameter("like_fauna");
			if(like_archaeological!=null)
				holidayLike=like_archaeological+",";
			if(like_mountains!=null)
				holidayLike=like_mountains+",";
			if(like_wildlife!=null)
				holidayLike=like_wildlife+",";
			if(like_fauna!=null)
				holidayLike=like_fauna+",";
			
			//faci_accomodation,faci_food,faci_transport,faci_comm,faci_guide,facilities;
			faci_accomodation=request.getParameter("faci_accomodation");
			faci_food=request.getParameter("faci_food");
			faci_transport=request.getParameter("faci_transport");
			faci_comm=request.getParameter("faci_comm");
			faci_guide=request.getParameter("faci_guide");
			if(faci_accomodation!=null)
				facilities=faci_accomodation+",";
			if(faci_food!=null)
				facilities=faci_food+",";
			if(faci_transport!=null)
				facilities=faci_transport+",";
			if(faci_comm!=null)
				facilities=faci_comm+",";
			if(faci_guide!=null)
				facilities=faci_guide+",";
			budget=request.getParameter("budget");
			standard=request.getParameter("standard");
			star2_3=request.getParameter("star2_3");
			star4_5=request.getParameter("star4_5");
			if(budget!=null)
				accomodation=budget+",";
			if(standard!=null)
				accomodation=standard+",";
			if(star2_3!=null)
				accomodation=star2_3+",";
			if(star4_5!=null)
				accomodation=star4_5+",";
			System.out.println(udm.getUname()+"~"+udm.getAddress()+
					"~"+udm.getContactno()+"~"+arrDate+"~"+depDate+"~"+holidayKind+"~"+
					holidayLike+"~"+facilities+"~"+accomodation);
			writeData();
			RequestDispatcher rd=request.getRequestDispatcher("DisplayTravelPlan.jsp");
			rd.forward(request, response);
						
		}
		finally{
			out.close();
		}
	}
	public void writeData()
	{
		try{
			System.out.println("1");
			fw=new FileWriter("E:/Servlets/ExoticaTravelsProject/PlanTravel.txt",true);
			bw=new BufferedWriter(fw);
			bw.write(udm.getUname()+"~"+udm.getAddress()+
					"~"+udm.getContactno()+"~"+arrDate+"~"+depDate+"~"+holidayKind+"~"+
					holidayLike+"~"+facilities+"~"+accomodation);
			bw.newLine();
			System.out.println("2");
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
              
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
