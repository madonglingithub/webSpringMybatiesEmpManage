package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.po.Dep;
import com.po.Welfare;
import com.util.AjAxUtils;
import com.util.BizServiceUtil;

@Controller
public class EmpController {
	@Resource(name="BizService")
	private BizServiceUtil bizservice;

	public BizServiceUtil getBizservice() {
		return bizservice;
	}

	public void setBizservice(BizServiceUtil bizservice) {
		this.bizservice = bizservice;
	}
	@RequestMapping(value="doinit_Emp.do")
	public String doinit(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> map=new HashMap<String, Object>();
		List<Dep> lsdep=bizservice.getDepservice().findAll();
		List<Welfare> lswf=bizservice.getWelfareservice().findAll();
		map.put("lsdep", lsdep);
		map.put("lswf", lswf);
		PropertyFilter propertyFilter=AjAxUtils.filterProperts("birthday","pic");
		  //将查询结果集合转化为json字符串
		  	String jsonstr=JSONObject.toJSONString(map,propertyFilter,SerializerFeature.DisableCircularReferenceDetect);
		  	System.out.println("json:"+jsonstr);
		  	//将本方法执行结果的json字符串返回到前台
		  	AjAxUtils.printString(response, jsonstr);
		return null;
	}
}
