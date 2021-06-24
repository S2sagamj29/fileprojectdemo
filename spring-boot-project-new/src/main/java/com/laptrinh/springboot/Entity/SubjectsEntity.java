package com.laptrinh.springboot.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="subjects")
public class SubjectsEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name ="ma_mon_hoc")
	private String mamonhoc;
	
	@Column(name="thay_co")
	private String thayco;
	
	  @ManyToMany(mappedBy = "subjects_lk")
	    private List<StudentsEntity> students_lk;

	

	public String getMamonhoc() {
		return mamonhoc;
	}

	public void setMamonhoc(String mamonhoc) {
		this.mamonhoc = mamonhoc;
	}

	public String getThayco() {
		return thayco;
	}

	public void setThayco(String thayco) {
		this.thayco = thayco;
	}

	public Long getId() {
		return id;
	}

	public List<StudentsEntity> getStudents_lk() {
		return students_lk;
	}

	public void setStudents_lk(List<StudentsEntity> students_lk) {
		this.students_lk = students_lk;
	}
	
	
}
