package cn.wisdomhotel.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wisdomhotel.dao.UserDao;
import cn.wisdomhotel.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public boolean UserIsExist(Integer id) {
		if(userDao.getUserById(id) != null)
			return true;
		return false;
	}
}
