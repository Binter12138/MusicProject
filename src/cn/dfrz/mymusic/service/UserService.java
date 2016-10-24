package cn.dfrz.mymusic.service;

import java.util.List;

import org.omg.CORBA.UserException;

import cn.dfrz.mymusic.dao.impl.UserDaoImpl;
import cn.dfrz.mymusic.entity.User;

public class UserService {

	private UserDaoImpl userDaoImpl = new UserDaoImpl();
	
	/**
	 * 注册功能
	 * @param user
	 * @throws UserException
	 */
	public void regist(User user)
	{
	
		userDaoImpl.add(user);
	}
	
	/**
	 * 按用户名进行查询
	 * @param username
	 * @return
	 */
	public User fingByUsername(String username)
	{
		User user = userDaoImpl.findByName(username);
		
			
		return user;
	}
	
	
	/**
	 * 按Email进行查找
	 * @param email
	 * @return
	 */
	public User findByUserEmail(String email)
	{
		User user = userDaoImpl.findByEmail(email);
		return user;
	}
	
	
	/**
	 * 用户登录功能
	 * @param form
	 * @return
	 */
	public User login(User form)
	
	{
		User user = userDaoImpl.findByName(form.getUsername());
		if(user == null)return null;
		if(!user.getPassword().equals(form.getPassword()))return null;
		return user;
	}
	
	public void active(String userid)
	{
		userDaoImpl.updateState(userid, true);
	}

	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> findAllUser()
	{
		List<User> userList = userDaoImpl.findAllUser();
		if(userList == null)return null;
		return userList;
		
	}
	
	
	/**
	 * 删除用户
	 * @param username
	 */
	public void delUser(String username){
		
		userDaoImpl.delUser(username);
		
	}
	
}
