package servlets.userManagement;

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

import entities.User;
import interfaces.IUserManagement;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	IUserManagement bean;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//ANALYSE REQUEST
		String jsonString = req.getQueryString();

		// convert queryString to JsonObject
		byte[] decodedBytes = Base64.getDecoder().decode(jsonString);
		jsonString = new String(decodedBytes);// String in Json Format
		JsonReader jsonReader = Json.createReader(new StringReader(jsonString));
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();

		try{
			User result = bean.logIn(jsonObject.getString("email"), jsonObject.getString("password"));
			if(result == null){
				result = new User();
			}
			resp.getWriter().print(result.toString());//return value
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("WARNING : Wrong Object Attributes!! or Error in bean-method");
			resp.getWriter().print(new User().toString());
		}
		
		//RESPOND
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");

	}



}
