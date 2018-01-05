package cn.wisdomhotel.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.wisdomhotel.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/checkuser")
	public String checkUser(Integer id) {
		System.out.println("========" + userService.getUserList().size());
		return JSON.toJSONString(userService.getUserList());
	}
}