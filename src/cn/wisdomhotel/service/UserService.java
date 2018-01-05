package cn.wisdomhotel.service;

import java.util.List;

import cn.wisdomhotel.pojo.User;

public interface UserService {
	boolean UserIsExist(Integer id);
	
	List<User> getUserList();
}
