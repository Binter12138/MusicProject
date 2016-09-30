package cn.dfrz.mymusic.service;

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
	public User fingByUsername(String username)
	{
		User user = userDaoImpl.findByName(username);
		
			
		return user;
	}
	
	public User findByUserEmail(String email)
	{
		User user = userDaoImpl.findByEmail(email);
		return user;
	}
	
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

	
}
