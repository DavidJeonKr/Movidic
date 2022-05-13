package com.variable.movidic.user.service;

import com.variable.movidic.domain.UserVO;

public interface UserService {

	public int userRegister(UserVO vo);
	public UserVO loginCheck(UserVO vo);
	
	int check_email(String email);
	
}
