package cn.dfrz.mymusic.dao;

import java.util.List;

import cn.dfrz.mymusic.entity.Album;

public interface AlbumDao {

	/**
	 * 添加专辑
	 * @param album
	 */
	public void addAlbum(Album album);
	
	/**
	 * 查找专辑
	 * @param albumname
	 * @return
	 */
	public Album findAlbumName(String albumname);
	
	/**
	 * 查找所有的专辑
	 * @return
	 */
	public List<Album> find();
	
	
	/**
	 * 删除专辑
	 * @param albumname
	 */
	public void delAlbum(String albumname);
}
