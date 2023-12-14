/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.guenzun.main;

import java.lang.reflect.AccessFlag;
import java.util.ArrayList;
import java.util.Scanner;
import pkg.guenzun.model.ModelDienThoai;
import pkg.guenzun.model.ModelHangHoa;
import pkg.guenzun.model.ModelMayTinhBang;
import pkg.guenzun.model.ModelPhuKien;

/**
 *
 * @author GF63
 */
public class MainCuaHang {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ModelHangHoa> danhsach = new ArrayList<>();
        while (true) {            
            System.out.println("Menu:");
            System.out.println("1. Cai dat gia tri thuong");
            System.out.println("2. Them hang hoa");
            System.out.println("3. In danh sach");
            System.out.println("4. Thong ke dien thoai/ may tinh bang/  phu kien");
            System.out.println("0. Exit");
            
            int choice = sc.nextInt();
            
            
            switch (choice) {
                case 1:
                    ModelHangHoa
                    break;
                case 2:
                    System.out.println("Chon loai hang (1.Dien thoai/ 2. May Tinh Bang/ 3. Phu Kien)");
                    int loaiHang = sc.nextInt();
                    ModelHangHoa hang = null;
                    if (loaiHang ==1) {
                        hang = new ModelDienThoai();
                    }
                    else if (loaiHang == 2) {
                        hang = new ModelMayTinhBang();
                    }
                    else if (loaiHang == 3) {
                        hang = new ModelPhuKien();
                    }
                hang.nhapThongtin();
                danhsach.add(hang);
                    
                    break;
                    
                case 3:
                    System.out.println("Danh sach hang hoa");
                    for (ModelHangHoa hangHoa : danhsach) {
                        hangHoa.hienThongtin();
                    }
                    break;
                case 4:
                    int soDT =0;
                    int soMTB =0;
                    int soPK =0;
                    for (ModelHangHoa hangHoa : danhsach) {
                        if (hangHoa instanceof ModelDienThoai) {
                            soDT++;}
                        else if (hangHoa instanceof ModelMayTinhBang) {
                            soMTB++;
                            
                        }
                        else if (hangHoa instanceof ModelPhuKien) {
                            soPK++;
                            
                        }
                    
                    }
                        System.out.println("so Dien thoai: "+ soDT);
                        System.out.println("so May tinh bang: "+ soMTB);
                        System.out.println("so Phu kien: "+ soPK);
                    break;
                    
                 case 0:
                     System.out.println("Oyasumi");
                     System.exit(0);
                    break;
                default:
                    System.out.println("nhap lai");
                    break;
            }
        }
    }
}
