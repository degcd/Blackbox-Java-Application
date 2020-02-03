package servlets.statistics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.StatisticUserObject;
import interfaces.IStatisticCalculator;

/**
 * Servlet implementation class GetStatisticsServlet
 */
@WebServlet("/getStatistics")
public class GetStatisticsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	IStatisticCalculator bean;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//ANALYSE REQUEST

		try{
			String result = bean.getStatistics();
			resp.getWriter().print(result);//return value
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("WARNING : Wrong Object Attributes!! or Error in bean-method");
			resp.getWriter().print(getJsonStringArrayFromList(new ArrayList<StatisticUserObject>()));
		}
		
		//RESPOND
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");

	}
	
	public String getJsonStringArrayFromList(List<StatisticUserObject> list) {
    	String result="[";
    	for(StatisticUserObject obj:list) {
    		result+=obj.toString()+",";
    	}
    		char[] chars=result.toCharArray();
    		chars[chars.length-1]=']';
    		result=new String(chars);
    		return result;
}

}
