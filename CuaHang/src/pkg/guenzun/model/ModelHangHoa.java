/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.guenzun.model;

import java.util.Scanner;

/**
 *
 * @author GF63
 */
public class ModelHangHoa {
    private String tenHang;
    private int maHang;
    private int giaNhap;
    private int giaBan;
    public float thuongNhanVien;
    
    public ModelHangHoa(){
    
    }

    public String getTenHang() {
        return tenHang;
    }
    
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    
    public int getMaHang() {
        return maHang;
    }
    
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    
    public int getGiaNhap() {
        return giaNhap;
    }
    
     public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }
     
    public int getGiaBan() {
        return giaBan;
    }
    
    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    public float getThuongNhanVien() {
        return thuongNhanVien;
    }

    public void setThuongNhanVien(float thuongNhanVien) {
        this.thuongNhanVien = thuongNhanVien;
    }
    
    public void nhapThuongNhanVien(){
        System.out.println("Nhap thuong nhan vien:");
        float thuongNV = new Scanner(System.in).nextFloat();
        setThuongNhanVien(thuongNhanVien);
    }
    
    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang:");
        tenHang = sc.nextLine();
        System.out.println("Nhap ma hang:");
        maHang = sc.nextInt();
        System.out.println("Gia nhap:");
        giaNhap = sc.nextInt();
        System.out.println("Gia ban:");
        giaBan = sc.nextInt();
    }
    
    public void hienThongtin(){
        System.out.println("Ten hang hoa: " + tenHang);
        System.out.println("Ma hang hoa: " + maHang);
        System.out.println("Gia nhap: "+giaNhap);
        System.out.println("Gia ban: "+giaBan);
        System.out.println("Thuong nhan vien: "+thuongNhanVien);

    }
   
}

