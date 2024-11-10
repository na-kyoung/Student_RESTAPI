package com.springboot.restapiEX.model;

public class StudentDto {
	private int sid;
	private String sname;
	private int sage;
	private String sdept;
	
	public StudentDto(int sid, String sname, int sage, String sdept) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sdept = sdept;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
}
