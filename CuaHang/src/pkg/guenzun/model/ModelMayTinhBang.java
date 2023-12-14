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
public class ModelMayTinhBang extends ModelHangHoa{
    public float kichThuocManHinh;
    public float loiNhuan;

    public ModelMayTinhBang() {
        super();
    }
       
    @Override
    public void nhapThongtin(){
        System.out.println("Nhap thong tin may tinh bang");
        super.nhapThongtin();
     
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap kich thuoc man hinh:");
     kichThuocManHinh = sc.nextFloat();
     System.out.println("Nhap loi nhuan: ");
     loiNhuan = sc.nextFloat();
     }
       
    public void hienThongtin(){
        System.out.println("May tinh bang");
        super.hienThongtin();
        System.out.println("Kich thuoc man hinh: "+kichThuocManHinh);
        System.out.println("Loi nhuan: "+loiNhuan);
        
        }
       
}

