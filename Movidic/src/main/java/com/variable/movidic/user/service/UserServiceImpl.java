package com.variable.movidic.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.variable.movidic.domain.UserVO;
import com.variable.movidic.user.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Override
	public int userRegister(UserVO vo) {
			
		int result=userMapper.userRegister(vo);
		return result;
	}

	@Override
	public UserVO loginCheck(UserVO vo) {
		// TODO Auto-generated method stub
		
		UserVO result=userMapper.loginCheck(vo);
		return result;
	}
	
	

}
