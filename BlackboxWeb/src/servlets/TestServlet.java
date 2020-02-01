package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.TestBean;

public class TestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3208415682126821808L;
	
	@EJB
	TestBean bean;
	
	/**
	 * 
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	bean.hello("Gisela");
    	String answer="hallo";
    	res.setContentType("application/json");
    	res.setHeader("Access-Control-Allow-Origin", "*");
        res.getWriter().print( "{\"result\":\""+answer+"\"}" );
        
    }

}