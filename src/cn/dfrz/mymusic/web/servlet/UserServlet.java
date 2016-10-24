package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.User;
import cn.dfrz.mymusic.service.UserService;

public class UserServlet extends HttpServlet {
	
	UserService userService = new UserService();

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");
		if(methodName.equals("findAllUser"))
		{
			findAllUser(request, response);
		}
		else if(methodName.equals("delUser"))
		{
			delUser(request, response);
		}
		else if(methodName.equals("loginManager"))
		{
			loginManager(request, response);
		}
		else if(methodName.equals("exitManager"))
		{
			exitManager(request, response);
		}
		
	}
	
	
	
	public void findAllUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		List<User> userList = userService.findAllUser();
		request.setAttribute("allUser", userList);
		request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		
		
	}
	
	public void delUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		userService.delUser(username);
		List<User> userList = userService.findAllUser();
		request.setAttribute("allUser", userList);
		request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		
	}
	
	
	public void loginManager(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminname = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(adminname.equals("admin") && password.equals("admin"))
		{
			request.getSession().setAttribute("admin", adminname);
			response.sendRedirect(request.getContextPath()+"/music/manager/index.jsp");
		}
		else{
			request.setAttribute("error", "用户名或密码错误");
			request.getRequestDispatcher("/music/adminlogin.jsp").forward(request, response);
			
			
		}
	}
	
	
	public void exitManager(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath()+"/music/adminlogin.jsp");
	}
	
}
