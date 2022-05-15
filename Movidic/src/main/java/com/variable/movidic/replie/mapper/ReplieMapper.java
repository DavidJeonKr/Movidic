package com.variable.movidic.replie.mapper;

import java.util.List;

import com.variable.movidic.domain.ReplieVO;

public interface ReplieMapper {
	
	public int insert(ReplieVO replieVO);
	List<ReplieVO> read(Integer mno);
	public int deleteReplie(int mno);
	
}
