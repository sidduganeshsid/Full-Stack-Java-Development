package com.sag.dto;

public class Student {
	
	private Integer sid;
	private String sname;
	private String sdob;
	private String sgender;
	private String saddress;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdob() {
		return sdob;
	}
	public void setSdob(String sdob) {
		this.sdob = sdob;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	public Student(Integer sid, String sname, String sdob, String sgender, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdob = sdob;
		this.sgender = sgender;
		this.saddress = saddress;
	}
	
	
}
