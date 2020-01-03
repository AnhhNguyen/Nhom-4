package com._01._01.entity;

import javax.persistence.*;

@Entity
public class ClassSinhVien {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer maSv;
		private String hoSv;
		private String tenSv;
		private String ngaySinh;
		private String diaChi;
		private String noiSinh;
		private String maKhoa;
		public Integer getMaSv() {
			return maSv;
		}
		public void setMaSv(Integer maSv) {
			this.maSv = maSv;
		}
		public String getHoSv() {
			return hoSv;
		}
		public void setHoSv(String hoSv) {
			this.hoSv = hoSv;
		}
		public String getTenSv() {
			return tenSv;
		}
		public void setTenSv(String tenSv) {
			this.tenSv = tenSv;
		}
		public String getNgaySinh() {
			return ngaySinh;
		}
		public void setNgaySinh(String ngaySinh) {
			this.ngaySinh = ngaySinh;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getNoiSinh() {
			return noiSinh;
		}
		public void setNoiSinh(String noiSinh) {
			this.noiSinh = noiSinh;
		}
		public String getMaKhoa() {
			return maKhoa;
		}
		public void setMaKhoa(String maKhoa) {
			this.maKhoa = maKhoa;
		}
		public ClassSinhVien(Integer maSv, String hoSv, String tenSv, String ngaySinh, String diaChi, String noiSinh,
				String maKhoa) {
			super();
			this.maSv = maSv;
			this.hoSv = hoSv;
			this.tenSv = tenSv;
			this.ngaySinh = ngaySinh;
			this.diaChi = diaChi;
			this.noiSinh = noiSinh;
			this.maKhoa = maKhoa;
		}
		public ClassSinhVien() {
			super();
		}
		
}
