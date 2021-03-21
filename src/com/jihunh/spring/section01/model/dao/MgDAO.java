package com.jihunh.spring.section01.model.dao;

import java.util.List;

import com.jihunh.spring.section01.model.dto.MgDTO;

public interface MgDAO {

	List<MgDTO> selectMgList();

}
