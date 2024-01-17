/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.thi.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg.thi.model.ModelStudent;
import pkg.thi.service.ServicePerson;

/**
 *
 * @author GF63
 */
public class ImpPerson implements ServicePerson{

    @Override
    public void inputPerson(ModelStudent std) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        std.setName(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        std.setBirth(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        std.setDiaChi(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        std.setGioiTinh(sc.nextLine());
        
    }

    @Override
    public void infoPerson(ModelStudent std) {
        System.out.println("Ten: "+std.getName());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birth = dateFormat.parse(std.getBirth());
            System.out.println("Ngay sinh: "+dateFormat.format(birth));
        } catch (ParseException ex) {
            Logger.getLogger(ImpPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Dia chi: "+std.getDiaChi());
        System.out.println("Diem tong ket: "+std.getDiemTongKet());
    }
    
}
