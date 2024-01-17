/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.dic.imp;

import java.util.Scanner;
import pkg.dic.model.ModelDic;
import pkg.dic.service.ServiceDic;

/**
 *
 * @author GF63
 */
public class ImpDic implements ServiceDic{

    @Override
    public void inputDic(ModelDic dic) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu: ");
        dic.setKeyWord(sc.nextLine());
        System.out.println("Nhap loai tu: ");
        dic.setType(sc.nextLine());
        System.out.println("Nhap nghia cua tu:: ");
        dic.setDefi(sc.nextLine());
        
    }

    @Override
    public void infoDic(ModelDic dic) {
        System.out.println(dic.getKeyWord()+" ("+dic.getType()+") "+dic.getDefi());
    }
    
}
