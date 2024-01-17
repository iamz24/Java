/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.dic.imp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import pkg.dic.model.ModelDic;
import pkg.dic.service.ServiceMap;

/**
 *
 * @author GF63
 */
public class ImpMap implements ServiceMap{
    ImpDic impDic = new ImpDic();
    @Override
    public Map<String, ModelDic> inputMap() {
        Map<String, ModelDic> mapDic = new HashMap<String, ModelDic>();
        while (true){
            ModelDic dic = new ModelDic();
            impDic.inputDic(dic);
            mapDic.put(dic.getKeyWord(), dic);
            System.out.println("Press any key to continue or q to go back to menu!");
            String choice = new Scanner(System.in).nextLine();
            if(choice.equals("q")){
                break;
            }
        }
        
        return mapDic;
        
    }

    @Override
    public void infoMap(Map<String, ModelDic> mapDic) {
        for(Entry<String,ModelDic> s : mapDic.entrySet()){
            impDic.infoDic(s.getValue());
        }
    }

    @Override
    public void findMap(Map<String, ModelDic> mapDic) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu muon tim: ");
        String find = sc.nextLine();
        ModelDic dic = mapDic.get(find);
        if(dic!=null){
            System.out.println("Tu can tim la:");
            impDic.infoDic(dic);
            return;
        } else {
            System.out.println("Tu can tim chua co trong tu dien, tien hanh them:");
            ModelDic add = new ModelDic();
            impDic.inputDic(add);
            mapDic.put(add.getKeyWord(), add);
            System.out.println("Them thanh cong!");
            return;
        }
    }

    @Override
    public void luuFile(Map<String, ModelDic> mapDic) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("dic.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mapDic);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
    
}
