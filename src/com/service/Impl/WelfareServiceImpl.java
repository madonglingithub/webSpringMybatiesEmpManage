package com.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.po.Dep;
import com.po.Welfare;
import com.service.IDepService;
import com.service.IWelfareService;
import com.util.DaoServiceUtil;
@Service("WelfareBiz")
@Transactional
public class WelfareServiceImpl implements IWelfareService{
	@Resource(name="DaoService")
	private DaoServiceUtil Daoservice;
	public DaoServiceUtil getDaoservice() {
		return Daoservice;
	}

	public void setDaoservice(DaoServiceUtil daoservice) {
		Daoservice = daoservice;
	}

	@Override
	public List<Welfare> findAll() {
		// TODO Auto-generated method stub
		return Daoservice.getWelfareMapper().findAll();
	}

	

}
