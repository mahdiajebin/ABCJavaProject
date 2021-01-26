package com.learning.j10.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.j10.Service.ABCService;
import com.learning.j10.model.ABC;
import com.learning.j10.utility.Utility;
/**
 * Servlet implementation class ABCWeb
 */
public class ABCWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    /**
     * Default constructor. 
     */
    public ABCWeb() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String path = "/WEB-INF/abc.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
		
		
		String author = Utility.isNull(request::getParameter, "author", "Mahdia Jebin");
		String displayMode = Utility.isNull(request::getParameter, "displaymode", "abc");
		String highlight = Utility.isNull(request::getParameter, "highlight", "abc");
		
		
	
		
	
		
		//int[] data = {10,20,30};
		ABCService service = new ABCService();
		ABC[] data = service.getAlphabets(displayMode, highlight);
		request.setAttribute("abc", data);
		request.setAttribute("author", author);
		request.setAttribute("displaymode", displayMode);

		requestDispatcher.forward(request, response);
		
	}


}
