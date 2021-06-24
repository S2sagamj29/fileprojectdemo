package com.laptrinh.springboot.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.laptrinh.springboot.DTO.StudentsDTO;
import com.laptrinh.springboot.Entity.StudentsEntity;
import com.laptrinh.springboot.Entity.SubjectsEntity;

@Component
public class StudentsConverter {

	public StudentsEntity toEntity(StudentsDTO dto) {
		StudentsEntity entity = new StudentsEntity();
		entity.setLop(dto.getLop());
		entity.setMasinhvien(dto.getMa_sinh_vien());
		entity.setNgaysinh(dto.getNgay_sinh());
		entity.setTensinhvien(dto.getTen_sinh_vien());
	    return entity;
	}
	
	public StudentsDTO toDto(StudentsEntity entity) {
		StudentsDTO dto = new StudentsDTO();
		List<String> em = new ArrayList<>();
		dto.setId(entity.getId());
		dto.setLop(entity.getLop());
		dto.setMa_sinh_vien(entity.getMasinhvien());
		dto.setNgay_sinh(entity.getNgaysinh());
		dto.setTen_sinh_vien(entity.getTensinhvien());
		for(SubjectsEntity s : entity.getSubjects_lk()) {
			
			em.add(s.getMamonhoc());
		}
		dto.setMon_dang_ki(em);
		return dto;
	}
}
