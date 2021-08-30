package com.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.po.Dep;
import com.service.IDepService;
import com.util.DaoServiceUtil;
@Service("DepBiz")
@Transactional
public class DepServiceImpl implements IDepService{
	@Resource(name="DaoService")
	private DaoServiceUtil Daoservice;
	public DaoServiceUtil getDaoservice() {
		return Daoservice;
	}

	public void setDaoservice(DaoServiceUtil daoservice) {
		Daoservice = daoservice;
	}

	@Override
	public List<Dep> findAll() {
		// TODO Auto-generated method stub
		return Daoservice.getDepMapper().findAll();
	}

}
