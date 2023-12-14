/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.guenzun.main;

import java.util.ArrayList;
import java.util.Scanner;
import pkg.guenzun.model.ModelConNguoi;
import pkg.guenzun.model.ModelGiaoVien;
import pkg.guenzun.model.ModelNhanVien;
import pkg.guenzun.model.ModelSinhVien;

/**
 *
 * @author GF63
 */
public class MainCanBo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ModelConNguoi> danhsach = new ArrayList<>();
        while (true) {            
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm người vào danh sách");
            System.out.println("2. In danh sách");
            System.out.println("3. Thống kê số sinh viên/ giáo viên/  nhân viên");
            System.out.println("0. Thoát");
            
            int choice = sc.nextInt();
            
            
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại người(1.Sinh viên/2. Giáo viên/ 3. Nhân viên)");
                    int loainguoi = sc.nextInt();
                    ModelConNguoi nguoi = null;
                    if (loainguoi ==1) {
                        nguoi = new ModelSinhVien();
                    }
                    else if (loainguoi == 2) {
                        nguoi = new ModelGiaoVien();
                    }
                    else if (loainguoi == 3) {
                        nguoi = new ModelNhanVien();
                    }
                nguoi.nhapThongtin();
                danhsach.add(nguoi);
                    
                    break;
                    
                case 2:
                    System.out.println("danh sách nguoi");
                    for (ModelConNguoi conNguoi : danhsach) {
                        conNguoi.HienThongtin();
                    }
                    break;
                case 3:
                    int soSV =0;
                    int soGV =0;
                    int soNV =0;
                    for (ModelConNguoi conNguoi : danhsach) {
                        if (conNguoi instanceof ModelSinhVien) {
                            soSV++;}
                        else if (conNguoi instanceof ModelGiaoVien) {
                            soGV++;
                            
                        }
                        else if (conNguoi instanceof ModelNhanVien) {
                            soNV++;
                            
                        }
                    
                    }
                        System.out.println("số Sinh viên: "+ soSV);
                        System.out.println("số giáo viên: "+ soGV);
                        System.out.println("số nhân viên: "+ soNV);
                    break;
                    
                 case 0:
                     System.out.println("cút");
                     System.exit(0);
                    break;
                default:
                    System.out.println("nhập lại");
            }
        }
    }
}

