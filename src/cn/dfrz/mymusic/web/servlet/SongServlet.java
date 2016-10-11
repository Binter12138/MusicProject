package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.Song;
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
				request.getRequestDispatcher("/music/index.jsp").forward(request, response);
				return;
			}
			else{
				request.setAttribute("songname", "该歌曲已经存在");
				request.getRequestDispatcher("/music/manager/addsong.jsp").forward(request, response);
				
			}
	}
	

}
