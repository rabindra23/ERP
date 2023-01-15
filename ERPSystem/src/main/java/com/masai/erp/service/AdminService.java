package com.masai.erp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.erp.entity.Student;

@Service
public interface AdminService {

	 public List<Student> getTotalStudents();
	 public List<Student> getClasswiseStudents(int stuClass);
	 public Student getStudentDetails(int stuId);
	 
}
