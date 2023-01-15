package com.masai.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.erp.entity.Fee;
import com.masai.erp.entity.Student;
import com.masai.erp.repository.FeeRepository;
import com.masai.erp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	FeeRepository feeRepository;
	
	
	@Override
	@PreAuthorize("hasRole('CLERK')")
	@PreAuthorize("hasRole('TEACHER')")
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	@PreAuthorize("hasRole('CLERK')")
	@PreAuthorize("hasRole('TEACHER')")
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	@PreAuthorize("hasRole('CLERK')")
	@PreAuthorize("hasRole('TEACHER')")
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);

	}

	@Override
	@PreAuthorize("hasRole('CLERK')")
	@PreAuthorize("hasRole('TEACHER')")
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	@PreAuthorize("hasRole('CLERK')")
	public void addFee(int stuId, Fee fee) {
		Student student = studentRepository.findById(stuId).orElse(null);
		fee.setStudent(student);
		feeRepository.save(fee);

	}

	@Override
	public void payFee(int fId, Double feeAmt) {
		Fee fee = feeRepository.findById(fId).orElse(null);
		fee.setFeeAmt(fee.getFeeAmt()-feeAmt);
		feeRepository.save(fee);
		if(fee.getFeeAmt() == 0.0) {
			Student student = fee.getStudent();
			student.setFeeStatus("Full Paid");
			studentRepository.save(student);
		}

	}

}
