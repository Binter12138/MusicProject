package cn.dfrz.mymusic.web.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.dfrz.mymusic.entity.Singer;
import cn.dfrz.mymusic.service.SingerService;

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
			else if(methodName.equals("findAllSinger"))
			{
				findAllSinger(request, response);
			}
			else if(methodName.equals("delSinger"))
			{
				delSinger(request, response);
			}
			else if(methodName.equals("findsinger"))
			{
				findsinger(request, response);
			}
	}
	public void viewSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		List<Singer> singerList = singerService.find();
		
		if(singerList.isEmpty())
		{
			request.setAttribute("singerNotFind", "没有歌手");
			request.getRequestDispatcher("/music/singerlist.jsp").forward(request, response);
		}
		else{
			
			request.setAttribute("singername", singerList);
			request.getRequestDispatcher("/music/singerlist.jsp").forward(request, response);
		}
		
	}
	
	public void addSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		response.setContentType("text/html;charset=utf-8");
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload fileUpload = new ServletFileUpload(factory);
		try {
			List<FileItem> fileItemList = fileUpload.parseRequest(request);
			String singername = fileItemList.get(0).getString("utf-8");
			String sex = fileItemList.get(1).getString("utf-8");
			String singerinfo = fileItemList.get(2).getString("utf-8");
			String singerregion = fileItemList.get(3).getString("utf-8");
			String singerattention = fileItemList.get(4).getString("utf-8");
			
			FileItem f5 = fileItemList.get(5);
			

			String root = this.getServletContext().getRealPath("/music/files");
			String singerimage = f5.getName();//获取上传的文件名称
			File file = new File(root,singerimage);
			
				f5.write(file);
			Singer singern = singerService.findByName(singername);
			if(singern == null)
			{
				Singer singer = new Singer(1, singername, sex, singerinfo, singerregion, 100, singerimage);
				singerService.addSinger(singer);
				request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
				return;
			}else{
				request.setAttribute("addsingername", "该歌手已经存在");
				request.getRequestDispatcher("/music/manager/addsinger.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public void findAllSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		List<Singer> singerList = singerService.find();
		
		if(singerList.isEmpty())
		{
			request.setAttribute("allsinger", "没有歌手");
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		}
		else{
			
			request.setAttribute("allsinger", singerList);
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		}
	}
	
	
	public void delSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String singername = request.getParameter("singername");
		singerService.delSinger(singername);
		
		List<Singer> singerList = singerService.find();
		
		request.setAttribute("allsinger", singerList);
		request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		
	}
	
	public void findsinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String singerName = request.getParameter("singername");
		Singer singer = singerService.findByName(singerName);
		request.setAttribute("singerimage", singer.getSingerimage());
		request.getRequestDispatcher("/music/play.jsp").forward(request, response);
		
	}
	
	
	





}
