/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.de06.imp;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import pkg.de06.model.ModelSVAT;
import pkg.de06.service.ServiceSVAT;

/**
 *
 * @author GF63
 */
public class ImpSvat implements ServiceSVAT{
    ImpSinhVien impSV = new ImpSinhVien();
    @Override
    public void inputSVAT(ModelSVAT svat) {
        impSV.inputSinhVien(svat);
        System.out.println("Nhap hoc phi: ");
        svat.setHocPhi(new Scanner(System.in).nextLong());
    }

    @Override
    public void infoSVAT(ModelSVAT svat) {
        impSV.infoSinhVien(svat);
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        System.out.println("Hoc phi: "+format.format(svat.getHocPhi()));
    }
    
}
