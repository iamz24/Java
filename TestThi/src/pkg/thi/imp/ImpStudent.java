/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.thi.imp;

import java.util.Scanner;
import pkg.thi.model.ModelStudent;
import pkg.thi.service.ServiceStudent;

/**
 *
 * @author GF63
 */
public class ImpStudent implements ServiceStudent{
    ImpPerson impPerson = new ImpPerson();
    @Override
    public void inputStudent(ModelStudent std) {
        Scanner sc = new Scanner(System.in);
        impPerson.inputPerson(std);
        System.out.println("Nhap ma sinh vien: ");
        std.setMaSinhVien(sc.nextLine());
        System.out.println("Nhap email: ");
        std.setEmail(sc.nextLine());
        if(std.getEmail().contains("@")){
            String[] checkEmail = std.getEmail().split("@");
            if(checkEmail.length == 2){
                if(!checkEmail[1].contains(".com")){
                    System.out.printf("Email sai cau truc");
                    return;
                }
            } else {
                System.out.printf("Email sai cau truc");
                return;
            }
        } else {
            System.out.println("Email sai cau truc");
            return;
        }
        
        System.out.println("Nhap diem tong ket: ");
        std.setDiemTongKet(sc.nextDouble());
    }

    @Override
    public void infoStudent(ModelStudent std) {
       impPerson.infoPerson(std);
        System.out.println("Ma sinh vien: "+std.getMaSinhVien());
        System.out.println("Email: "+std.getEmail());
        System.out.println("Diem tong ket: "+std.getDiemTongKet());
    }
    
}
