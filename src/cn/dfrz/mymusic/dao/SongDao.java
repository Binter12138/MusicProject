package cn.dfrz.mymusic.dao;

import java.util.List;

import cn.dfrz.mymusic.entity.Song;

public interface SongDao {
	
	/**
	 * 按歌手或歌曲的名称进行查找
	 * @param singername
	 * @return
	 */
	public List<Song> findSong(String singername);
	
	/**
	 * 添加歌曲
	 * @param song
	 */
	public void addsong(Song song);


}
