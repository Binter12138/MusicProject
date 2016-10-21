package cn.dfrz.mymusic.service;

import java.util.List;

import cn.dfrz.mymusic.dao.impl.UserCollectionDaoImpl;
import cn.dfrz.mymusic.entity.UserCollection;

public class UserCollectionService {

	UserCollectionDaoImpl collectionDaoImpl = new UserCollectionDaoImpl();
	public void addUserCollection(UserCollection uc)
	{
		collectionDaoImpl.addUserCollection(uc);
	}
	

	public List<UserCollection> findUserCollection(String username)
	{
		List<UserCollection> ucList = collectionDaoImpl.findUserCollection(username);
		if(ucList == null)
		return null;
		return ucList;
	}
	
	public UserCollection findSongName(String songname,String username)
	{
		UserCollection collection = collectionDaoImpl.findSongName(songname,username);
		if(collection == null)return null;
		return collection;
		
	}
}
