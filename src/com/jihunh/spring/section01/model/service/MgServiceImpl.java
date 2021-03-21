package com.jihunh.spring.section01.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihunh.spring.section01.model.dao.MgDAO;
import com.jihunh.spring.section01.model.dto.MgDTO;

@Service
public class MgServiceImpl implements MgService {
	
	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public MgServiceImpl(MgDAO mgDAO, SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<MgDTO> selectMgList() {
		
		return sqlSession.getMapper(MgDAO.class).selectMgList();
	}
	
}

