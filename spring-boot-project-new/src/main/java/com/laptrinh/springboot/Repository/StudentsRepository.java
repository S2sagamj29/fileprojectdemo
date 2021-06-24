package com.laptrinh.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinh.springboot.Entity.StudentsEntity;

public interface StudentsRepository extends JpaRepository<StudentsEntity, Long> {
List<StudentsEntity> findByMasinhvien(String masinhvien);

}
