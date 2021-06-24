package com.laptrinh.springboot.Service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinh.springboot.Converter.StudentsConverter;
import com.laptrinh.springboot.DTO.StudentsDTO;
import com.laptrinh.springboot.Entity.StudentsEntity;
import com.laptrinh.springboot.Entity.SubjectsEntity;
import com.laptrinh.springboot.Repository.StudentsRepository;
import com.laptrinh.springboot.Repository.SubjectsRepository;

@Service
public class StudentService implements IStudentservice{

	@Autowired
	StudentsConverter students_converter;
	
	@Autowired
	StudentsRepository students_repository;
	
	@Autowired
	SubjectsRepository subjects_repositoty;

	@Override
	@Transactional
	public StudentsDTO save(StudentsDTO dto) {
		List<SubjectsEntity> list = new ArrayList<>();
		students_repository.deleteAll();
		StudentsEntity stu = new StudentsEntity();
		students_converter.toEntity(dto);
		for(String i : dto.getMon_dang_ki()) {
			SubjectsEntity sub = subjects_repositoty.findByMamonhoc(i);
			list.add(sub);
		}
		stu.setSubjects_lk(list);
		students_repository.save(stu);
		return students_converter.toDto(stu);
	}

	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentsDTO> findAll() {
		List<StudentsEntity> stu = students_repository.findAll();
		List<StudentsDTO> list = new ArrayList<>();
		for(StudentsEntity s : stu) {
			list.add(students_converter.toDto(s));
			
		}
		return list;
	}
	
	
}
