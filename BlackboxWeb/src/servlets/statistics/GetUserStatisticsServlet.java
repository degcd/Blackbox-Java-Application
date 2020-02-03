package servlets.statistics;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
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

import interfaces.ICommunicationManagement;
import interfaces.IStatisticCalculator;

/**
 * Servlet implementation class GetUserStatisticsServlet
 */
@WebServlet("/getUserStatistics")
public class GetUserStatisticsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	IStatisticCalculator bean;
	
	@EJB
	ICommunicationManagement parserBean;

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

		//use json object to execute logic
		try{
			String result = bean.getStatistics(jsonObject.getInt("userID"));
			resp.getWriter().print(result);//return value
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("WARNING : Wrong Object Attributes!! or Error in bean-method");
			resp.getWriter().print(parserBean.getJsonStringArrayFromList(new ArrayList<Object>()));//TODO leere Liste?!
		}
		
		//RESPOND
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");

	}

}
