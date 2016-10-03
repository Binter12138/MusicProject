package cn.dfrz.mymusic.service;

import java.util.List;

import cn.dfrz.mymusic.dao.impl.SongDaoImpl;
import cn.dfrz.mymusic.entity.Song;

public class SongService {
	
	SongDaoImpl songDaoImpl = new SongDaoImpl();
	
	public List<Song> findsong(String singername)
	{
		
		List<Song> songList = songDaoImpl.findSong(singername);
		if(songList == null)return null;
		return songList;
		
	}
	

	public void addsong(Song song)
	{
		songDaoImpl.addsong(song);
	}

}
