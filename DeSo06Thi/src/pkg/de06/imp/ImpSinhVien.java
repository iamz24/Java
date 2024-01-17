/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.de06.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg.de06.model.ModelSinhVien;
import pkg.de06.service.ServiceSinhVien;

/**
 *
 * @author GF63
 */
public class ImpSinhVien implements ServiceSinhVien{

    @Override
    public void inputSinhVien(ModelSinhVien sv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        sv.setMaSinhVien(sc.nextLine());
        System.out.println("Nhap ten: ");
        sv.setHoTen(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        sv.setGioiTinh(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        sv.setNgaySinh(sc.nextLine());
        System.out.println("Nhap diem trung binh: ");
        sv.setDiemTB(sc.nextDouble());
    }

    @Override
    public void infoSinhVien(ModelSinhVien sv) {
        System.out.println("Ma sinh vien: "+sv.getMaSinhVien());
        System.out.println("Ten: "+sv.getHoTen());
        System.out.println("Gioi tinh: "+sv.getGioiTinh());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(sv.getNgaySinh());
            System.out.println("Ngay sinh"+dateFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(ImpSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Diem trung binh: "+sv.getDiemTB());
    }
    
}
