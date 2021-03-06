package cn.dfrz.mymusic.dao;

import java.util.List;

import cn.dfrz.mymusic.entity.UserCollection;

public interface UserCollectionDao {

	/**
	 * 用户收藏歌曲
	 * @param uc
	 */
	public void addUserCollection(UserCollection uc);
	
	/**
	 * 查找收藏的歌曲
	 * @param songname
	 * @return
	 */
	public List<UserCollection> findUserCollection(String username);
	
	/**
	 * 查找歌曲是否存在
	 * @param songname
	 * @return
	 */
	public UserCollection findSongName(String songname,String username);
}
