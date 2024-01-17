/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.de06.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pkg.de06.imp.ImpList;
import pkg.de06.model.ModelSVAT;
import pkg.de06.model.ModelSVMM;

/**
 *
 * @author GF63
 */
public class MainSinhVien {
    public static void main(String[] args) {
        ImpList impList = new ImpList();
        List<ModelSVAT> listSVAT = new ArrayList<ModelSVAT>();
        List<ModelSVMM> listSVMM = new ArrayList<ModelSVMM>();
        while (true) { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Sinh vien an toan");
            System.out.println("2. Sinh vien mat ma");
            int choice = sc.nextInt();
            if (choice==1) {
                System.out.println("1. Them sinh vien");
                System.out.println("2. In danh sach");
                int choice2 = sc.nextInt();
                if (choice2 == 1) {
                    listSVAT = impList.inputListSVAT();
                }
                if (choice2 == 2) {
                    impList.infoListSVAT(listSVAT);
                }
            } else if (choice == 2) {
                System.out.println("1. Them sinh vien");
                System.out.println("2. In danh sach");
                int choice2 = sc.nextInt();
                if (choice2 == 1) {
                    listSVMM = impList.inputListSVMM();
                }
                if (choice2 == 2) {
                    impList.infoListSVMM(listSVMM);
                }
            }
        }
    }
}
