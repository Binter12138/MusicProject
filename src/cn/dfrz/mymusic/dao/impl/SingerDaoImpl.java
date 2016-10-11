package cn.dfrz.mymusic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dfrz.mymusic.dao.SingerDao;
import cn.dfrz.mymusic.entity.Singer;
import cn.itcast.jdbc.JdbcUtils;

public class SingerDaoImpl implements SingerDao{

	/**
	 * 根据歌手的名字查找
	 */
	public Singer findByName(String singerName) {

		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_singer where singername=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, singerName);
			rs = pstmt.executeQuery();
			if(!rs.next())return null;
			Singer singer = new Singer();
			singer.setSingerid(rs.getInt("singerid"));
			singer.setSingername(rs.getString("singername"));
			singer.setSex(rs.getString("sex"));
			singer.setSingerinfo(rs.getString("singerinfo"));
			singer.setSingerregion(rs.getString("singerregion"));
			singer.setSingerattention(rs.getInt("singerattention"));
			singer.setSingerimage(rs.getString("singerimage"));
			return singer;
			
			
			
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
		finally 
		{
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addSinger(Singer singer) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into music_singer(singername,sex,singerinfo,singerregion,singerattention,singerimage) values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, singer.getSingername());
			pstmt.setString(2, singer.getSex());
			pstmt.setString(3, singer.getSingerinfo());
			pstmt.setString(4, singer.getSingerregion());
			pstmt.setInt(5, singer.getSingerattention());
			pstmt.setString(6, singer.getSingerimage());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con !=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public List<Singer> find() {
		List<Singer> singerList = new ArrayList<Singer>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_singer";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Singer singer = new Singer();
				singer.setSingername(rs.getString("singername"));
				singerList.add(singer);
			}
			return singerList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con !=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
	}

}
