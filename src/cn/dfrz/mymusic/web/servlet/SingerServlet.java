package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.Singer;
import cn.dfrz.mymusic.entity.Song;
import cn.dfrz.mymusic.service.SingerService;
import cn.itcast.commons.CommonUtils;

public class SingerServlet extends HttpServlet {
	
	SingerService singerService = new SingerService();


	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String methodName = request.getParameter("method");
			if(methodName.equals("viewSinger"))
			{
				viewSinger(request, response);
			}else if(methodName.equals("addSinger"))
			{
				addSinger(request, response);
			}
	}
	public void viewSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//get提交处理乱码问题
		String singerName=new String(request.getParameter("singerName").getBytes("iso-8859-1"),"UTF-8");
//		String singerName = request.getParameter("singerName");
		Singer singer = singerService.findByName(singerName);
		if(singer == null)
		{
			request.setAttribute("errorname", "没有找到该歌手");
			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("singername", singer);
			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
		}
		System.out.println(singerName);
	}
	
	public void addSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String singerName = request.getParameter("singername");
		Singer singern = singerService.findByName(singerName);
		if(singern == null)
		{
			Singer singer = CommonUtils.toBean(request.getParameterMap(), Singer.class);
			System.out.println(singer.getSingername());
			singerService.addSinger(singer);
			return;
		}else{
			request.setAttribute("addsingername", "该歌手已经存在");
			request.getRequestDispatcher("music/addsinger.jsp").forward(request, response);
		}
	}
	
	
	





}
