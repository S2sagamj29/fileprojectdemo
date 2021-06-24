package com.laptrinh.springboot.DTO;

import java.util.List;

public class StudentsDTO {

	private Long id;
	private String ten_sinh_vien;
	private String ma_sinh_vien;
	private String lop;
	private String ngay_sinh;
	private List<String> mon_dang_ki;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTen_sinh_vien() {
		return ten_sinh_vien;
	}
	public void setTen_sinh_vien(String ten_sinh_vien) {
		this.ten_sinh_vien = ten_sinh_vien;
	}
	public String getMa_sinh_vien() {
		return ma_sinh_vien;
	}
	public void setMa_sinh_vien(String ma_sinh_vien) {
		this.ma_sinh_vien = ma_sinh_vien;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNgay_sinh() {
		return ngay_sinh;
	}
	public void setNgay_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	public List<String> getMon_dang_ki() {
		return mon_dang_ki;
	}
	public void setMon_dang_ki(List<String> mon_dang_ki) {
		this.mon_dang_ki = mon_dang_ki;
	}
	
	

}
