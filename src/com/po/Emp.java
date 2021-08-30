package com.po;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Emp implements Serializable{//��Ա��
	private Integer eid;//��Ա���
	private String ename;//��Ա����
	private String sex;//��Ա�Ա�
	private String address;//��Ա��ַ
	private Date birthday;//��Ա����
	private String photo="default.jpg";//��Ա��Ƭ
	private Integer depid;//��Ա�������ű��
	/**��ҳ����ص���ʱ����**/
	private String depname;//��������
	private Float emoney;//н��
	//����
	private String[] wids;//�����������
	private List<Welfare> lswf;//��������
	//�ļ��ϴ�
	private MultipartFile pic;
	//����ת������
	private String sdate;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer eid, String ename, String sex, String address, Date birthday, String photo, Integer depid,
			String depname, Float emoney, String[] wids, List<Welfare> lswf, MultipartFile pic, String sdate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.photo = photo;
		this.depid = depid;
		this.depname = depname;
		this.emoney = emoney;
		this.wids = wids;
		this.lswf = lswf;
		this.pic = pic;
		this.sdate = sdate;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public Float getEmoney() {
		return emoney;
	}
	public void setEmoney(Float emoney) {
		this.emoney = emoney;
	}
	public String[] getWids() {
		return wids;
	}
	public void setWids(String[] wids) {
		this.wids = wids;
	}
	public List<Welfare> getLswf() {
		return lswf;
	}
	public void setLswf(List<Welfare> lswf) {
		this.lswf = lswf;
	}
	public MultipartFile getPic() {
		return pic;
	}
	public void setPic(MultipartFile pic) {
		this.pic = pic;
	}
	public String getSdate() {
		if(birthday!=null){
			sdate=new SimpleDateFormat("yyyy-MM-dd").format(birthday);
		}
		return sdate;
	}
	public void setSdate(String sdate) {
		if(sdate!=null){
			try {
				birthday=new SimpleDateFormat("yyyy-MM-dd").parse(sdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.sdate = sdate;
	}
	
	
	
}