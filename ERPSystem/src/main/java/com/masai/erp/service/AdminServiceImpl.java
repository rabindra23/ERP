package com.masai.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.erp.entity.Student;
import com.masai.erp.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public List<Student> getTotalStudents() {
		return studentRepository.findAll();
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public List<Student> getClasswiseStudents(int stuClass) {
		return studentRepository.findById(stuClass).get();
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public Student getStudentDetails(int stuId) {
		return studentRepository.findById(stuId).get();
	}

}
