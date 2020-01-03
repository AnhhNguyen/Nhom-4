package com._01._01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com._01._01.entity.ClassSinhVien;
import com._01._01.service.ServiceRescontroller;

@RestController
@RequestMapping(value  = "/api")
public class ApiRescontroller {
	@Autowired
	ServiceRescontroller rescontroller;
	
	@RequestMapping(value ="/lietke")
	public List<ClassSinhVien> lietke(){
		return this.rescontroller.lietkeall();
	}
	@RequestMapping(value = "/add")
	public boolean  insertOne(@RequestBody ClassSinhVien classSinhVien) {
		rescontroller.insertone(classSinhVien);
		return true;
	}
	@RequestMapping(value = "/detele")
	public boolean  deteleone(@RequestParam(name = "id") Integer sv) {
		rescontroller.deteleone(sv);
		return true;
	}
	@RequestMapping(value = "/update")
	public boolean  updateOne(@RequestBody ClassSinhVien classSinhVien) {
		rescontroller.updateOne(classSinhVien);
		return true;
	}
	@GetMapping(value = "/getname")
	public List<ClassSinhVien> getAllName(@RequestParam (name = "ten") String ten ) {
		return rescontroller.getAllByName(ten);
	}
	
}
