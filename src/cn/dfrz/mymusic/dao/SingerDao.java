package cn.dfrz.mymusic.dao;

import cn.dfrz.mymusic.entity.Singer;

public interface SingerDao {

	/**
	 * 按歌手的名字查找
	 * @param singerName
	 * @return
	 */
	public Singer findByName(String singerName);
	
	/**
	 * 添加歌手
	 * @param singer
	 */
	public void addSinger(Singer singer);
	
}
