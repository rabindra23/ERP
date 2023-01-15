package com.masai.erp.entity;

public class Student {

	private int stuId;
	private String sname;
	private int stuClass;
	private String feeStatus;
	private Fee fee;
	

	public Student(int stuId, String sname, int stuClass, String feeStatus, Fee fee) {
		super();
		this.stuId = stuId;
		this.sname = sname;
		this.stuClass = stuClass;
		this.feeStatus = feeStatus;
		this.fee = fee;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStuClass() {
		return stuClass;
	}

	public void setStuClass(int stuClass) {
		this.stuClass = stuClass;
	}

	public String getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}
	
	
	
	
	
}
