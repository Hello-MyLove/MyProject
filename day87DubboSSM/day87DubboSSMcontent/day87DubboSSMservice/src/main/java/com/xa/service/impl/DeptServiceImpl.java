package com.xa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.dao.DeptDao;
import com.xa.pojo.Deptbean;
import com.xa.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public List<Deptbean> selectAll() {
		return deptDao.selectAll();
	}

}
