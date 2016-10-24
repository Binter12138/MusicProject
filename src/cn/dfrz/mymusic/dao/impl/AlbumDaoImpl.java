package cn.dfrz.mymusic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dfrz.mymusic.dao.AlbumDao;
import cn.dfrz.mymusic.entity.Album;
import cn.itcast.jdbc.JdbcUtils;

public class AlbumDaoImpl implements AlbumDao{

	public void addAlbum(Album album) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into music_ablum value(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, album.getAlbumname());
			pstmt.setString(2, album.getSingername());
			pstmt.setString(3, album.getAlbunimage());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con !=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public Album findAlbumName(String albumname) {
		
		
		return null;
	}

	public List<Album> find() {

		List<Album> albumList = new ArrayList<Album>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_ablum";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Album album = new Album();
				album.setAlbumname(rs.getString("ablum_name"));
				album.setSingername(rs.getString("singername"));
				album.setAlbunimage(rs.getString("ablum_image"));
				albumList.add(album);
			}
			return albumList;
			
		} catch (SQLException e) {

			
			e.printStackTrace();
		}finally
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

	public void delAlbum(String albumname) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "delete from music_ablum where ablum_name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, albumname);
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(con != null)con.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
