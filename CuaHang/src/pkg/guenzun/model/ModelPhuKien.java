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
public class ModelPhuKien extends ModelHangHoa {
    public float heSo;
     public float loiNhuan;

    public ModelPhuKien() {
        super();
    }
       
    @Override
    public void nhapThongtin(){
        System.out.println("Nhap thong tin Phu kien");
        super.nhapThongtin();
     
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap he so:");
     heSo = sc.nextFloat();
     System.out.println("Nhap loi nhuan: ");
     loiNhuan = sc.nextFloat();
     }
       
    public void hienThongtin(){
        loiNhuan = (getGiaBan() - getGiaNhap())*(1-getThuongNhanVien())*heSo;
        System.out.println("Phu kien");
        super.hienThongtin();
        System.out.println("He so: "+heSo);
        System.out.println("Loi nhuan: "+loiNhuan);
        
        }
       
}
