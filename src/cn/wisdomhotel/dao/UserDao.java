package cn.wisdomhotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.wisdomhotel.pojo.User;

public interface UserDao {
	User getUserById(@Param("id")Integer id);
	
	List<User> getUserList();
}
