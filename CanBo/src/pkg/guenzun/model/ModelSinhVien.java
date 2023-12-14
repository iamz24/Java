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
public class ModelSinhVien extends ModelConNguoi{
    public String Masv;
    public double diem;
    
    public ModelSinhVien(){
        super();
    }
    
    @Override
    public void nhapThongtin(){
       System.out.println("Nhap thong tin sinh viên:");
       super.nhapThongtin();
       Scanner sc = new Scanner(System.in); 
       System.out.println("Nhap mã sinh viên:");
       Masv = sc.nextLine();
       System.out.println("Nhap điểm:");
       diem = sc.nextDouble();
         
    }
    
    @Override
    public void HienThongtin(){
        System.out.println("SINH VIEN");
        super.HienThongtin();
        System.out.println("mã sv: " + Masv);
        System.out.println("điểm: "+ diem);
        
    }
    
}
