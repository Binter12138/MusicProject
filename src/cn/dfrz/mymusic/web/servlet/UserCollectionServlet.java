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
		String songname = request.getParameter("songname");
		String singername = request.getParameter("singername");
		UserCollection userCollection = new UserCollection(1, songname, singername);
		service.addUserCollection(userCollection);
//		request.getRequestDispatcher("/music/viewsinger").forward(request, response);
		
	
	}
	
	public void findUserCollection(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		List<UserCollection> ucList = service.findUserCollection();
		if(ucList.isEmpty())
		{
			request.setAttribute("usercoll", "您还没有收藏歌曲");
			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
			return;
		}
		else{
			request.setAttribute("userCollection", ucList);
			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
		}
		
	}

}
