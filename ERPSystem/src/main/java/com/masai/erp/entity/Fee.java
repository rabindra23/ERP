package com.masai.erp.entity;

public class Fee {

	private int fId;
	private double feeAmt;
	private int installmentNumber;
	private String dueDate;
	private Student student;
	
	
	public Fee(int fId, double feeAmt, int installmentNumber, String dueDate, Student student) {
		super();
		this.fId = fId;
		this.feeAmt = feeAmt;
		this.installmentNumber = installmentNumber;
		this.dueDate = dueDate;
		this.student = student;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public double getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(double feeAmt) {
		this.feeAmt = feeAmt;
	}

	public int getInstallmentNumber() {
		return installmentNumber;
	}

	public void setInstallmentNumber(int installmentNumber) {
		this.installmentNumber = installmentNumber;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
