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
public class ModelGiaoVien extends ModelConNguoi{
     public String khoa;
     public int sotietday;

    public ModelGiaoVien() {
        super();
    }
       
    @Override
    public void nhapThongtin(){
        System.out.println("Nhap thong tin giao vien");
        super.nhapThongtin();
     
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap khoa:");
     khoa = sc.nextLine();
     System.out.println("Nhap so tiết dạy: ");
     sotietday = sc.nextInt();
     
     }
       
    public void HienThongtin(){
        System.out.println("GIÁO VIÊN");
        super.HienThongtin();
        System.out.println("khoa: "+ khoa);
        System.out.println("so tiết day: "+ sotietday);
        
         }
       
}

