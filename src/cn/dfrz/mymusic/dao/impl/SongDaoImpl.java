package cn.dfrz.mymusic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dfrz.mymusic.dao.SongDao;
import cn.dfrz.mymusic.entity.Song;
import cn.itcast.jdbc.JdbcUtils;

public class SongDaoImpl implements SongDao{

	/**
	 * 查找歌曲或歌手
	 */
	public List<Song> findSong(String singername) {
		List<Song> songList = new ArrayList<Song>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "select * from music_song where singername=? or songname=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, singername);
			pstmt.setString(2, singername);
		
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Song song = new Song();
				song.setSongname(rs.getString("songname"));
				song.setSingername(rs.getString("singername"));
				songList.add(song);
			}
			return songList;
			
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}

	public void addsong(Song song) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into music_song(songname,singername,songpath,songalbum,songtype,songheat) values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, song.getSongname());
			pstmt.setString(2, song.getSingername());
			pstmt.setString(3, song.getPath());
			pstmt.setString(4, song.getAlbum());
			pstmt.setString(5, song.getType());
			pstmt.setInt(6, song.getHeat());
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
	
	



}