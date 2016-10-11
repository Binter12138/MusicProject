package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.User;
import cn.dfrz.mymusic.service.UserService;
import cn.itcast.commons.CommonUtils;

public class LoginServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath()+"/music/index.jsp");
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		UserService userService = new UserService();
		
		User form = CommonUtils.toBean(request.getParameterMap(), User.class);
		User user = userService.login(form);
		
		if(user == null){
			request.setAttribute("message", "用户名或密码错误");
			request.setAttribute("error", form);
			request.getRequestDispatcher("/music/login.jsp").forward(request, response);
		}
		else {
			
//			request.setAttribute("username", form.getUsername());
			request.getSession().setAttribute("username", form.getUsername());
//			request.getRequestDispatcher("/music/index.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/music/index.jsp");
		}
		
		
	
	}

}
