/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.thi.imp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pkg.thi.model.ModelStudent;
import pkg.thi.service.ServiceList;

/**
 *
 * @author GF63
 */
public class ImpList implements ServiceList{
    ImpStudent impStd = new ImpStudent();
    @Override
    public List<ModelStudent> inputList() {
        List<ModelStudent> listStudent = new ArrayList<ModelStudent>();
        while(true){
            ModelStudent std = new ModelStudent();
            impStd.inputStudent(std);
            listStudent.add(std);
            System.out.println("Press any key to continue or q to go back menu!");
            String choice = new Scanner(System.in).nextLine();
            if(choice.equals("q")){
                break;
            }
        }
  
        return listStudent;
        
    }

    @Override
    public void infoList(List<ModelStudent> listStudent) {
        for(ModelStudent modelStudent : listStudent){
            impStd.infoStudent(modelStudent);
        }
    }

    @Override
    public void luuFile(List<ModelStudent> listStudent) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("sinhvien.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(listStudent);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
    
}
