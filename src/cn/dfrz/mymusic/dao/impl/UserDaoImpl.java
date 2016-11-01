package cn.dfrz.mymusic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import cn.dfrz.mymusic.dao.UserDao;
import cn.dfrz.mymusic.entity.User;
import cn.dfrz.mymusic.utils.JdbcUtils;

public class UserDaoImpl implements UserDao {

	
	public void add(User user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into music_user values(?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, user.getUserId());
			pstmt.setString(1, user.getUserid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getRepassword());
			pstmt.setString(5, user.getSex());
			pstmt.setString(6, user.getEmail());
			pstmt.setString(7, user.getBrithday());
			pstmt.setString(8, user.getCode());
			pstmt.setBoolean(9, user.isState());
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

	public void update(User user) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con =JdbcUtils.getConnection();
			String sql = "update music_user set password=?,sex=?,brithday=? where username=?";
			pstmt = con.prepareStatement(sql);
//			pstmt.setString(5, user.getUserId());
			pstmt.setString(4, user.getUsername());
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getSex());
			pstmt.setString(3, user.getBrithday());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

	public void delUser(String username) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "delete from music_user where username=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public User findByName(String username) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_user where username=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if(!rs.next())return null;
			User user = new User();
			user.setUserid(rs.getString("userid"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setRepassword(rs.getString("repassword"));
			user.setSex(rs.getString("sex"));
			user.setEmail(rs.getString("email"));
			user.setBrithday(rs.getString("brithday"));
			user.setCode(rs.getString("code"));
			user.setState(rs.getBoolean("state"));
			return user;
			
			
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
	public List<User> findAllUser() {
		List<User> userList = new ArrayList<User>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_user";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		
			
			while(rs.next())
			{
				User user = new User();

				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				
				user.setSex(rs.getString("sex"));
				user.setEmail(rs.getString("email"));
				user.setState(rs.getBoolean("state"));
				userList.add(user);
			}
		
			return userList;
			
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
				e.printStackTrace();
			}
		}
		
		
		
	}
	public User findByEmail(String email) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtils.getConnection();
			String sql = "select *from music_user where email=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(!rs.next())return null;
			User user = new User();
			user.setUserid(rs.getString("userid"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setRepassword(rs.getString("repassword"));
			user.setSex(rs.getString("sex"));
			user.setEmail(rs.getString("email"));
			user.setBrithday(rs.getString("brithday"));
			user.setCode(rs.getString("code"));
			user.setState(rs.getBoolean("state"));
			return user;
			
			
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

	public void updateState(String userid, boolean state) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con =JdbcUtils.getConnection();
			String sql = "update music_user set state=1 where userid=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

}
