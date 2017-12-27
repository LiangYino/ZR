package cn.wisdomhotel.dao;

import org.apache.ibatis.annotations.Param;

import cn.wisdomhotel.pojo.User;

public interface UserDao {
	User getUserById(@Param("id")Integer id);
}
