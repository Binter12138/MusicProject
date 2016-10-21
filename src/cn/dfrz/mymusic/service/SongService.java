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

	public Song findSongName(String songName)
	{
		Song song = songDaoImpl.findSongName(songName);
		if(song == null)return null;
		return song;
		
	}
	
	public List<Song> findAlbum(String albumname){
		List<Song> songList = songDaoImpl.findAlbum(albumname);
		if(songList == null)return null;
		return songList;
		
	}
}
