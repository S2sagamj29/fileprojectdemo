package com.laptrinh.springboot.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinh.springboot.DTO.StudentsDTO;
import com.laptrinh.springboot.Service.IStudentservice;

@RestController
public class APIStudents {

	@Autowired
	IStudentservice students;
	
  @PostMapping("/new")
  public StudentsDTO addStudent(@RequestBody StudentsDTO stu) {
	  return students.save(stu);
  }
}
