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
public class ModelDienThoai extends ModelHangHoa {
     public int giaSimGhep;
     public float loiNhuan;

    public ModelDienThoai() {
        super();
    }
       
    @Override
    public void nhapThongtin(){
        System.out.println("Nhap thong tin dien thoai");
        super.nhapThongtin();
     
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap gia sim ghep:");
     giaSimGhep = sc.nextInt();
     }
       
    public void hienThongtin(){
        loiNhuan = (getGiaBan() - getGiaNhap() - giaSimGhep)*(1-getThuongNhanVien());
        System.out.println("Dien thoai");
        super.hienThongtin();
        System.out.println("Gia sim ghep: "+giaSimGhep);
        System.out.println("Loi nhuan: "+loiNhuan);
        
        }
       
}
