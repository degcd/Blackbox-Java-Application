package servlets.gameplay;

import java.io.IOException;
import java.io.StringReader;
import java.util.Base64;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.IGameplayManagement;

/**
 * Servlet implementation class SendResponseToServerServlet
 */
@WebServlet("/sendResponseToServer")
public class SendResponseToServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	IGameplayManagement bean;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * call method on GameplayManagementBean to analyse answer
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//ANALYSE REQUEST
		
		try{
			boolean result = bean.receiveMsgFromClient(Long.parseLong(req.getParameter("answerID")),Long.parseLong(req.getParameter("userID")));
			resp.getWriter().print(result);//return value
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("WARNING : Wrong Object Attributes!! or Error in bean-method");
			resp.getWriter().print(false);
		}
		
		//RESPOND
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");

	}

}
