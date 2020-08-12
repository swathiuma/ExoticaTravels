

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   String loginId,password,uname;
   UserDetailsModel udm=new UserDetailsModel();
   HttpSession session;
   
    
   public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	//out.println(" hello  ");
    	try{
    		loginId=request.getParameter("loginid");
    		password=request.getParameter("password");
    		
    		boolean value=readFile();
    		if(value){
    			request.setAttribute("model", udm);
    			session=request.getSession();
    			   session.setAttribute("smodel",udm);
    			RequestDispatcher rd=request.getRequestDispatcher("WelcomPage.jsp");
    			rd.forward(request, response);    			
    		}
    		else{
    			RequestDispatcher rd=request.getRequestDispatcher("ErrorPage.jsp");
    			rd.forward(request, response);
    		}
    	}finally{
    		out.close();
    	}
    }
    boolean readFile(){
    	boolean value=false;
    	try{
    		FileReader fr=new FileReader("E:/Servlets/ExoticaTravelsProject/ExoticaTravelLogin.txt");
    		BufferedReader br=new BufferedReader(fr);
    		String data;
    		while((data=br.readLine())!=null)
    		{
    			System.out.println("Data:"+data);
    			String text[]=data.split("~");
    			System.out.println("start of cond..");
    			if(text[3].equals(loginId)&&text[4].equals(password))
    			{
    				uname=text[0];
    				udm.setUname(uname);
    				value=true;
    				break;
    			}
    			else{
    				value=false;
    				System.out.println("invalid details");
    			}
    		}
    		fr.close();
    	}catch(IOException ioe){
    		System.out.println(ioe);
    	}
    	return value;
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
