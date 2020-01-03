package com._01._01.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._01._01.dao.DaoSinhVien;
import com._01._01.entity.ClassSinhVien;


@Service
public class ServiceRescontroller {
	@Autowired
	DaoSinhVien serviceDaoSinhVien;
	//liet ke
	
	public List<ClassSinhVien> lietkeall() {
		return this.serviceDaoSinhVien.findAll();
	}
	// insert one
	public boolean insertone(ClassSinhVien sv) {
		serviceDaoSinhVien.save(sv);
		return true;
	}
	//detele one
	public boolean deteleone(Integer sv) {
		this.serviceDaoSinhVien.deleteById(sv);
		return true;
	}
	//update
	public boolean updateOne(ClassSinhVien sv) {
		serviceDaoSinhVien.save(sv);
		return true;
	}
	//tim 2 thuc the
	public List<ClassSinhVien> getAllByName(String cantim) {
		List<ClassSinhVien> list1 = this.serviceDaoSinhVien.findAll();
		List<ClassSinhVien> list2= new ArrayList<>();
		for (ClassSinhVien sv : list1) {
			if (sv.getHoSv().toLowerCase().matches(cantim.toLowerCase())) {
				list2.add(sv);
			}
			if (sv.getTenSv().toLowerCase().matches(cantim.toLowerCase())) {
				list2.add(sv);
			}
		}	
		return list2;	
	}
}
