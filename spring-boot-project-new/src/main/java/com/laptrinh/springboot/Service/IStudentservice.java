package com.laptrinh.springboot.Service;

import java.util.List;

import com.laptrinh.springboot.DTO.StudentsDTO;

public interface IStudentservice {

	public StudentsDTO save(StudentsDTO dto);
	public void delete(Long[] ids);
	public List<StudentsDTO> findAll();

}
