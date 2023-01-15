package com.masai.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.erp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
