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
public class ModelConNguoi {
    private String ten;
    private int tuoi;
    
    public ModelConNguoi(){
    
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = sc.nextInt();
    }
    
    public void HienThongtin(){
        System.out.println("ten:" + ten);
        System.out.println("tuoi: " + tuoi);
    
    }
   
}

