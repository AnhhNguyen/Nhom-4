package com._01._01.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import com._01._01.entity.ClassSinhVien;
@Transactional
public interface DaoSinhVien extends JpaRepository< ClassSinhVien, Integer> {

}
