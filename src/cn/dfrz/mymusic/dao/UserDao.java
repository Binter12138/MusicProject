package cn.dfrz.mymusic.dao;

import java.util.List;

import cn.dfrz.mymusic.entity.User;

public interface UserDao {
	/**
	 * 增加用户
	 * @param user
	 */
	public void add(User user);
	
	/**
	 * 修改用户
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * 删除用户
	 * @param user
	 */
	public void delUser(String username);
	
	
	/**
	 * 通过用户id查询用户
	 * @param userId
	 * @return
	 */
	public User findByName(String username);
	
	/**
	 * 通过Email查询
	 * @param email
	 * @return
	 */
	public User findByEmail(String email);
	
	
	/**
	 * 查看用户
	 * @return
	 */
	public List<User> findAllUser();
	
	
	
	
	public void updateState(String userid,boolean state);
	
	
	
}
