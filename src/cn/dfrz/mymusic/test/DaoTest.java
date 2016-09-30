package cn.dfrz.mymusic.test;

import java.util.List;

import cn.dfrz.mymusic.dao.impl.UserDaoImpl;
import cn.dfrz.mymusic.entity.User;

public class DaoTest {
	
	public static void main(String[] args) {
//		User user = new User("002", "lsi", "12s", "男", "2003-2-9");
		UserDaoImpl userDaoImpl = new UserDaoImpl();
//		User user = new User("001", "王五", "111", "nv", "2011-1-1");
//		userDaoImpl.add(user);
//		String userid = "002";
//		userDaoImpl.update(user);
//		userDaoImpl.delete(userid);
		System.out.println(userDaoImpl.findAll());
//		System.out.println(userDaoImpl.findAll());
//		System.out.println(userDaoImpl.findById(userid));
	}

}
