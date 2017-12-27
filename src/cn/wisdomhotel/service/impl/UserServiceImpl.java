package cn.wisdomhotel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wisdomhotel.dao.UserDao;
import cn.wisdomhotel.pojo.User;
import cn.wisdomhotel.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public boolean UserIsExist(Integer id) {
		User user = userDao.getUserById(id);
		System.out.println(user);
		if(user != null)
			return true;
		return false;
	}
}
