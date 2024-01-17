/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.thi.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg.thi.imp.ImpList;
import pkg.thi.model.ModelStudent;

/**
 *
 * @author GF63
 */
public class MainStudent {
    public static void main(String[] args) {
        
        List <ModelStudent> listStudent = new ArrayList<ModelStudent>();
        while(true){
            ImpList impList = new ImpList();
            System.out.println("Menu");
            System.out.println("1. Them sinh vien");
            System.out.println("2. In danh sach");
            System.out.println("3. Luu du lieu");
            System.out.println("4. Thoat");
            System.out.println("Moi lua chon: ");
            int choice = new Scanner(System.in).nextInt();
            if(choice == 4){
                break;
            }
            if(choice == 1){
                listStudent = impList.inputList();
            }
            if(choice == 2){
                impList.infoList(listStudent);
            }
            if (choice == 3){
                try {
                    impList.luuFile(listStudent);
                } catch (IOException ex) {
                    Logger.getLogger(MainStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
