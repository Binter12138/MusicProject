package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.UserCollection;
import cn.dfrz.mymusic.service.UserCollectionService;

public class UserCollectionServlet extends HttpServlet {
	UserCollectionService service = new UserCollectionService();

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");
		if(methodName.equals("collection"))
		{
			collection(request, response);
		}else if(methodName.equals("findUserCollection"))
		{
			findUserCollection(request, response);
		}
	}
	public void collection(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String songname = request.getParameter("songname");
		String singername = request.getParameter("singername");
		String songpath = request.getParameter("songpath");
		
		if(username.isEmpty())
		{
			response.sendRedirect(request.getContextPath()+"/music/login.jsp");
		}
		else{
			
			UserCollection collection = service.findSongName(songname,username);
			if(collection == null )
			{
				UserCollection userCollection = new UserCollection(username, songname, singername, songpath);
				
				service.addUserCollection(userCollection);
				
				response.sendRedirect(request.getContextPath()+"/music/index.jsp");
			}else{
				
				response.getWriter().write("<script>alert('该歌曲已经收藏过了')</script>");
				
			}
			
		}
		
	
	}
	
	public void findUserCollection(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		List<UserCollection> ucList = service.findUserCollection(username);
		
		if(username.isEmpty())
		{

			response.sendRedirect(request.getContextPath()+"/music/login.jsp");
		}
		else{
			request.setAttribute("userCollection", ucList);
			request.getRequestDispatcher("/music/collection.jsp").forward(request, response);
		}
		
	}

}
