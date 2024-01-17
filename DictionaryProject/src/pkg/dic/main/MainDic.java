/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.dic.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg.dic.imp.ImpMap;
import pkg.dic.model.ModelDic;

/**
 *
 * @author GF63
 */
public class MainDic {
    public static void main(String[] args) {
        ImpMap impMap = new ImpMap();
        Map<String,ModelDic> mapDic = new HashMap<String,ModelDic>();
        while (true){
            System.out.println("Menu");
            System.out.println("1. Them tu");
            System.out.println("2. Hien danh sach");
            System.out.println("3. Tim tu");
            System.out.println("4. Luu danh sach");
            System.out.println("5. Thoat");
            System.out.println("Moi chon: ");
            
            int choice = new Scanner(System.in).nextInt();
            if(choice==5){
                System.out.println("camonvidaden");
                break;
            }
            if(choice==1){
                mapDic = impMap.inputMap();
            }
            if(choice==2){
                impMap.infoMap(mapDic);
            }
            if(choice==3){
                impMap.findMap(mapDic);
            }
            if(choice==4){
                try {
                    impMap.luuFile(mapDic);
                } catch (IOException ex) {
                    Logger.getLogger(MainDic.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
             
        }
    }
}
