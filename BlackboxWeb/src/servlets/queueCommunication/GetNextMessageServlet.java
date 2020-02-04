package servlets.queueCommunication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.ICommunicationManagement;

/**
 * Servlet implementation class GetNextMessageServlet
 */
@WebServlet("/getNextMessage")
public class GetNextMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	ICommunicationManagement bean;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      call getNewMessages method on CommunicationManagementBean
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// ANALYSE REQUEST

		try {
			List<String> list = bean.getNewMessages(Long.parseLong(req.getParameter("userID")));
			String result = getJsonStringArrayFromList(list);
			resp.getWriter().print(result);// return value
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("WARNING : Wrong Object Attributes!! or Error in bean-method");
			resp.getWriter().print(getJsonStringArrayFromList(new ArrayList<String>()));// empty
																						// List
		}

		// RESPOND
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin", "*");

	}

	public String getJsonStringArrayFromList(List<String> list) {

    	String result="[";
    	for(String obj:list) {
    		result+=obj.toString()+",";
    	}
    		char[] chars=result.toCharArray();
    		if(chars[chars.length-1]==',') {
    			chars[chars.length-1]=']';
    			result=new String(chars);
    		}
    		else
    		{
    			result=new String(chars);
    			result+="]";
    		}
    		return result;
}

}
