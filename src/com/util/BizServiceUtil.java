package com.util;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.service.IDepService;
import com.service.IWelfareService;

@Service("BizService")
public class BizServiceUtil {
	@Resource(name="DepBiz")
	private IDepService depservice;
	@Resource(name="WelfareBiz")
	private IWelfareService welfareservice;
	public IDepService getDepservice() {
		return depservice;
	}
	public void setDepservice(IDepService depservice) {
		this.depservice = depservice;
	}
	public IWelfareService getWelfareservice() {
		return welfareservice;
	}
	public void setWelfareservice(IWelfareService welfareservice) {
		this.welfareservice = welfareservice;
	}
	
}
