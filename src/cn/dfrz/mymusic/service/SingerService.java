package cn.dfrz.mymusic.service;

import cn.dfrz.mymusic.dao.impl.SingerDaoImpl;
import cn.dfrz.mymusic.entity.Singer;

public class SingerService {
	
	SingerDaoImpl singerDaoImpl = new SingerDaoImpl();
	
	public Singer findByName(String singerName)
	{
		Singer singer = singerDaoImpl.findByName(singerName);
		if(singer == null)return null;
		
		return singer;
	}
	
	public void addSinger(Singer singer)
	{
//		findByName(singerName);
		singerDaoImpl.addSinger(singer);
	}
	
}
