package cn.dfrz.mymusic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dfrz.mymusic.dao.UserCollectionDao;
import cn.dfrz.mymusic.entity.PageBean;
import cn.dfrz.mymusic.entity.UserCollection;
import cn.itcast.jdbc.JdbcUtils;

public class UserCollectionDaoImpl implements UserCollectionDao{

	public void addUserCollection(UserCollection uc) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into music_collection value(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uc.getUsername());
			pstmt.setString(2, uc.getSongname());
			pstmt.setString(3, uc.getSingername());
			pstmt.executeUpdate();
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
		
		
	}

	public PageBean<UserCollection> findAll(int pageCode,int pageSize)
	{
		
		PageBean<UserCollection> pageBean = new PageBean<UserCollection>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totleRecode = 0;
		try {
			con = JdbcUtils.getConnection();
			pageBean.setPageCode(pageCode);
			pageBean.setPageSize(pageSize);
			String sql = "select count(*) from music_collection";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				totleRecode = rs.getInt(1);
			}
			pageBean.setTotleRecode(totleRecode);
			
			sql = "select *from music_collection limit ?,?";
			List<UserCollection> ucList = new ArrayList<UserCollection>();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	public List<UserCollection> findUserCollection(String username) {
		List<UserCollection> ucList = new ArrayList<UserCollection>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "SELECT c.* FROM music_user u,music_collection c WHERE c.username=u.username AND c.username=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				UserCollection userCollection = new UserCollection();
				userCollection.setSongname(rs.getString("songname"));
				userCollection.setSingername(rs.getString("singername"));
				ucList.add(userCollection);
			}
			return ucList;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con !=null)con.close();
				if(rs != null)rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}

	public UserCollection findSongName(String songname,String username) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con =JdbcUtils.getConnection();
			String sql = "select *from music_collection where songname=? and username=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, songname);
			pstmt.setString(2, username);
			
			rs = pstmt.executeQuery();
			if(!rs.next())return null;
			UserCollection userCollection = new UserCollection();
			userCollection.setSongname(rs.getString("username"));
			userCollection.setSongname(rs.getString("songname"));
			userCollection.setSingername(rs.getString("singername"));
			return userCollection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally 
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
		
		
		return null;
	}

	
}
