package com.variable.movidic.user.mapper;

import com.variable.movidic.domain.UserVO;

public interface UserMapper {

	public int userRegister(UserVO vo);
	public UserVO loginCheck(UserVO vo);
	public int check_email(String email);
	
}
