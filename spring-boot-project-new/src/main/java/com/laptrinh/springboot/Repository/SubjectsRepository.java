package com.laptrinh.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinh.springboot.Entity.SubjectsEntity;

public interface SubjectsRepository extends JpaRepository<SubjectsEntity, Long>{

SubjectsEntity findByMamonhoc(String mamonhoc);

}
