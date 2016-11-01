package cn.dfrz.mymusic.web.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.dfrz.mymusic.entity.Album;
import cn.dfrz.mymusic.service.AlbumService;

public class AlbumServlet extends HttpServlet {

	AlbumService albumService = new AlbumService();
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String methodName = request.getParameter("method");
		if(methodName.equals("findAlbum"))
		{
			findAlbum(request, response);
		}
		else if(methodName.equals("addAlbum"))
		{
			addAlbum(request, response);
		}
		else if(methodName.equals("findAllAlbum"))
		{
			findAllAlbum(request, response);
		}
		else if(methodName.equals("delAlbum"))
		{
			delAlbum(request, response);
		}else if(methodName.equals("modifyAlbum"))
		{
			modifyAlbum(request, response);
		}
		
	}
	
	
	
	
	public void findAlbum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		List<Album> albumList = albumService.find();
		if(albumList.isEmpty())
		{
			request.setAttribute("album", "没有找到专辑");
		}else{
			request.setAttribute("album", albumList);
			request.getRequestDispatcher("/music/special.jsp").forward(request, response);
		}
		
	}

	
	public void addAlbum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//创建工厂		
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
		try {
			List<FileItem> fileItemList = fileUpload.parseRequest(request);
			String albumname = fileItemList.get(0).getString("utf-8");
			String singername = fileItemList.get(1).getString("utf-8");
			String root = this.getServletContext().getRealPath("/music/files");
			String albunimage = fileItemList.get(2).getName();//获取文件名称
			File file = new File(root,albunimage);
			fileItemList.get(2).write(file);
			Album album = new Album(albumname, singername, albunimage);;
			albumService.addAlbum(album);
			response.sendRedirect(request.getContextPath()+"/music/manager/index.jsp");
//			request.getRequestDispatcher("/music/index.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void findAllAlbum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		List<Album> albumList = albumService.find();
		if(albumList.isEmpty())
		{
			request.setAttribute("allalbum", "没有找到专辑");
		}else{
			request.setAttribute("allalbum", albumList);
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		}
	}
	
	
	public void delAlbum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String albumname = request.getParameter("albumname");
		albumService.delAlbum(albumname);
		List<Album> albumList = albumService.find();
		request.setAttribute("allalbum", albumList);
		request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
	}
	
	public void modifyAlbum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String albumname = request.getParameter("albumname");
		String singername = request.getParameter("singername");
		String albumName = request.getParameter("albumName");
		String singerName = request.getParameter("singerName");
		System.out.println(albumname);
		System.out.println(singername);
		System.out.println(albumName);
		System.out.println(singerName);
		
	}

}
