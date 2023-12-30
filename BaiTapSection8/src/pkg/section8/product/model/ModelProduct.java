package pkg.section8.product.model;

import java.util.Scanner;

public class ModelProduct {
	private String tenHang;
	private int soLuong;
	private ModelCategory danhMuc;
	
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public ModelCategory getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(ModelCategory danhMuc) {
		this.danhMuc = danhMuc;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten mat hang: ");
		tenHang = sc.nextLine();
		System.out.println("Nhap so luong: ");
		soLuong = sc.nextInt();
	}
	
	public void output() {
		getDanhMuc().output();
		System.out.println("Mat hang: "+this.tenHang);
		System.out.println("So luong: "+this.soLuong);
		
	}
	
	
}
