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
public class ModelNhanVien extends ModelConNguoi{
     public String phongban;
    public int Ngayphep ;
    
    public ModelNhanVien(){
        super();
    
    }
    
    @Override
    public void nhapThongtin(){
        System.out.println("Nhap thông tin nhân viên:");
       super.nhapThongtin();
       Scanner sc = new Scanner(System.in); 
       System.out.println("Nhap phòng ban:");
       phongban = sc.nextLine();
       System.out.println("Nhap số ngày phép:");
       Ngayphep = sc.nextInt();
         
    }
    
    @Override
    public void HienThongtin(){
        System.out.println("NHÂN VIÊN");
        super.HienThongtin();
        System.out.println("phòng ban: " + phongban);
        System.out.println("số ngày phép: "+ Ngayphep);
        
    }
    
}


