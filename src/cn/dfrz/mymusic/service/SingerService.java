package cn.dfrz.mymusic.service;

import java.util.List;

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
	
	public List<Singer> find()
	{
		return singerDaoImpl.find();
		
	}
	
	
	public void delSinger(String singername){
		
		singerDaoImpl.delSinger(singername);
	}
	
	
	public void modifySinger(String singername, String sex, int singerattention,int singerid){
		singerDaoImpl.modifySinger(singername, sex, singerattention, singerid);
		
	}
}
