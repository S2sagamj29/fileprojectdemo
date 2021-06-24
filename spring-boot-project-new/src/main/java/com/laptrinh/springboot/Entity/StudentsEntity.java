package com.laptrinh.springboot.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ten_sinh_vien")
	private String tensinhvien;

	@Column(name = "ma_sinh_vien")
	private String masinhvien;

	@Column(name = "lop")
	private String lop;

	@Column(name = "ngay_sinh")
	private String ngaysinh;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "students_subjects", joinColumns = @JoinColumn(name = "students_id"), inverseJoinColumns = @JoinColumn(name = "subjects_id"))
	private List<SubjectsEntity> subjects_lk;

	
	public String getTensinhvien() {
		return tensinhvien;
	}

	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}

	public String getMasinhvien() {
		return masinhvien;
	}

	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public Long getId() {
		return id;
	}

	public List<SubjectsEntity> getSubjects_lk() {
		return subjects_lk;
	}

	public void setSubjects_lk(List<SubjectsEntity> subjects_lk) {
		this.subjects_lk = subjects_lk;
	}
	
	

}
