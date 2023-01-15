package com.masai.erp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.erp.entity.Fee;
import com.masai.erp.entity.Student;

@Service
public interface StudentService {

	public Student createStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> findAllStudents();
	public void addFee(int stuId, Fee fee);
	public void payFee(int fId, Double feeAmt);
}
