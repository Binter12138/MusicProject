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


	/**
	 * 查找歌曲是否存在
	 * @param songName
	 */
	public Song findSongName(String songName);
	
	
	/**
	 * 按专辑名查找歌曲
	 * @param albumname
	 * @return
	 */
	public List<Song> findAlbum(String albumname);
	
	/**
	 * 查找所有歌曲
	 * @return
	 */
	public List<Song> findAllSong();
	
	/**
	 * 删除歌曲
	 */
	public void delSong(String songname);
	
	
	/**
	 * 按照歌曲的热度进行排行
	 * @return
	 */
	public List<Song> rankSong();
	
	
	/**
	 * 修改歌曲
	 * @param songid
	 * @param songname
	 * @param singername
	 * @param albumname
	 */
	public void modifySong(int songid,String songname,String singername,String albumname);
}
