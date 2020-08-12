

import java.io.BufferedWriter;
import java.io.File;
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
 
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      String uname,city,contactno,loginid,password;
      HttpSession session;
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
			uname=request.getParameter("uname");
			city=request.getParameter("city");
			contactno=request.getParameter("contactno");
			loginid=request.getParameter("loginid");
			password=request.getParameter("password");
			
			writeFile();
			UserDetailsModel udm=new UserDetailsModel(uname,city,contactno,loginid,password);
			request.setAttribute("model", udm);
			session.setAttribute("smodel", udm);
			RequestDispatcher rd=request.getRequestDispatcher("WelcomPage.jsp");
			rd.forward(request, response);
			
		}finally{
			out.close();
		}
    	
	}
    void writeFile()
    {
    	try{
    		/*File myfile=new File("E:/ExoticaTravelLogin.txt");
    		if(myfile.createNewFile()){*/
    		File f=new File("E:/Servlets/ExoticaTravelsProject/ExoticaTravelLogin.txt");
    		if(f.exists())
    		{
    		System.out.println("file already exists");
    	    FileWriter fw=new FileWriter(f,true);
    		BufferedWriter bw=new BufferedWriter(fw);
    		bw.write(uname+"~"+city+"~"+contactno+"~"+loginid+"~"+password);
    		bw.newLine();
    		bw.close();
    		fw.close();
    		}
    		else{
    			File ff=new File("E:/Servlets/ExoticaTravelsProject/ExoticaTravelLogin.txt");
    			System.out.println("file not already exists");
    			FileWriter fw=new FileWriter(ff);
        		BufferedWriter bw=new BufferedWriter(fw);
        		PrintWriter p=new PrintWriter(bw);
        		p.println(uname+"~"+city+"~"+contactno+"~"+loginid+"~"+password);
        		bw.newLine();
        		bw.close();
        		fw.close();
    		}
    	}
    	catch(IOException e){
    		System.out.println(e);
    	}
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request,response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
