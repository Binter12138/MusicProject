package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.Singer;
import cn.dfrz.mymusic.entity.Song;
import cn.dfrz.mymusic.service.SingerService;
import cn.dfrz.mymusic.service.SongService;
import cn.itcast.commons.CommonUtils;

public class SongServlet extends HttpServlet {
	
	SongService songService = new SongService();


	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");
		if(methodName.equals("viewSong"))
		{
			viewSong(request, response);
		}else if(methodName.equals("addSong")){
			addSong(request, response);
		}
		else if(methodName.equals("viewalbumsong"))
		{
			viewalbumsong(request, response);
		}
		else if(methodName.equals("findAllSong"))
		{
			findAllSong(request, response);
		}
		else if(methodName.equals("delSong"))
		{
			delSong(request, response);
		}
		
	}
	
	
	
	public void viewSong(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//get提交处理乱码问题
		
		String singerName=request.getParameter("singerName");
		List<Song> songList = songService.findsong(singerName);
		if(songList.isEmpty())
		{
			request.setAttribute("song", "没有找到");
			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
		}
		else {
			
			request.setAttribute("songname", songList);
			request.setAttribute("singern", singerName);
			request.getRequestDispatcher("/music/songlist.jsp").forward(request, response);
		}
	
	}
	public void addSong(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			
			String songName = request.getParameter("songname");
			Song songname = songService.findSongName(songName);
			if(songname == null)
			{
				Song song = CommonUtils.toBean(request.getParameterMap(), Song.class);
				songService.addsong(song);
				request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
				return;
			}
			else{
				request.setAttribute("songname", "该歌曲已经存在");
				request.getRequestDispatcher("/music/manager/addsong.jsp").forward(request, response);
				
			}
	}
	public void viewalbumsong(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
			String albumname = request.getParameter("albumname");
			List<Song> songList = songService.findAlbum(albumname);
			if(songList.isEmpty())
			{
				request.setAttribute("message", "该专辑没有歌曲");
			}
			else
			{
				request.setAttribute("message", songList);
				request.getRequestDispatcher("/music/albumsong.jsp").forward(request, response);
			}
	}
	public void findAllSong(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		List<Song> songList = songService.findAllSong();
		if(songList == null)
		{
			request.setAttribute("allSong", "暂时还没有歌曲");
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("allSong", songList);
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		}
	}
	
	public void delSong(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String songname = request.getParameter("songname");
		songService.delSong(songname);
		List<Song> songList = songService.findAllSong();
		
			request.setAttribute("allSong", songList);
			request.getRequestDispatcher("/music/manager/index.jsp").forward(request, response);
		
		
		
		
	}
	
	

}
