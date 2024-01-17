/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.de06.imp;

import java.util.Scanner;
import pkg.de06.model.ModelSVMM;
import pkg.de06.service.ServiceSVMM;

/**
 *
 * @author GF63
 */
public class ImpSVMM implements ServiceSVMM{
    ImpSinhVien impSV = new ImpSinhVien();
    @Override
    public void inputSVMM(ModelSVMM svmm) {
        Scanner sc = new Scanner(System.in);
        impSV.inputSinhVien(svmm);
        System.out.println("Nhap don vi: ");
        svmm.setDonVi(sc.nextLine());
        System.out.println("Nhap tro cap: ");
        svmm.setTroCap(sc.nextLong());
    }

    @Override
    public void infoSVMM(ModelSVMM svmm) {
        impSV.infoSinhVien(svmm);
        System.out.println("Don vi: "+svmm.getDonVi());
        System.out.println("Tro cap: "+svmm.getTroCap());
    }
    
}
