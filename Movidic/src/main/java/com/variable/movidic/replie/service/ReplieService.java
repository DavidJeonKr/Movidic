package com.variable.movidic.replie.service;

import java.util.List;

import com.variable.movidic.domain.ReplieVO;

public interface ReplieService {
	
	int insert(ReplieVO replieVO);

	List<ReplieVO> read(Integer mno);

}
