package cn.dfrz.mymusic.service;

import java.util.List;

import cn.dfrz.mymusic.dao.impl.AlbumDaoImpl;
import cn.dfrz.mymusic.entity.Album;

public class AlbumService {

	AlbumDaoImpl albumDaoImpl = new AlbumDaoImpl();
	public void addAlbum(Album album)
	{
		albumDaoImpl.addAlbum(album);
	}
	
	
	public List<Album> find()
	{
		List<Album> albumList = albumDaoImpl.find();
		if(albumList == null)return null;
		return albumList;
		
		
	}
}
