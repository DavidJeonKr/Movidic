package com.variable.movidic.replie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.variable.movidic.domain.ReplieVO;
import com.variable.movidic.replie.mapper.ReplieMapper;


@Service
public class ReplieServiceImpl implements ReplieService {

	private static final Logger logger = LoggerFactory.getLogger(ReplieServiceImpl.class);
	
	@Autowired
	private ReplieMapper replieMapper;
	
	@Override
	public int insert(ReplieVO replieVO) {
		logger.info("replieserviceimple => ");
		int result = replieMapper.insert(replieVO);
		logger.info("result =>  => {}", result);
		
		return result;
	}

	@Override
	public List<ReplieVO> read(Integer mno) {
		List<ReplieVO> replieVO = replieMapper.read(mno);
//		logger.info("RepliServiceImpl 호출 => replieVO: {}", replieVO);
		return replieVO;
	}

}
