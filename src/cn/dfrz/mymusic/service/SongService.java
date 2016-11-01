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
	
	
	/**
	 * 查找所有的歌曲
	 * @return
	 */
	public List<Song> findAllSong(){
		
		List<Song> songList = songDaoImpl.findAllSong();
		if(songList == null)return null;
		return songList;
				
	}
	
	/**
	 * 按照歌曲的热度进行排行
	 * @return
	 */
	public List<Song> rankSong()
	{
		List<Song> songList = songDaoImpl.rankSong();
		if(songList == null)return null;
		return songList;
		
		
	}
	
	/**
	 * 按歌曲的名字删除歌曲
	 * @param songname
	 */
	public void delSong(String songname){
		
		songDaoImpl.delSong(songname);
	}
	
	
	public void modifySong(int songid,String songname,String singername,String albumname){
		songDaoImpl.modifySong(songid, songname, singername, albumname);
	}
}
