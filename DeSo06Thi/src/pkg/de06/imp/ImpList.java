/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.de06.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pkg.de06.model.ModelSVAT;
import pkg.de06.model.ModelSVMM;
import pkg.de06.service.ServiceList;

/**
 *
 * @author GF63
 */
public class ImpList implements ServiceList{
    ImpSVMM impSVMM = new ImpSVMM();
    ImpSvat impSvat = new ImpSvat();
    @Override
    public List<ModelSVAT> inputListSVAT() {
        List<ModelSVAT> listSvat = new ArrayList<ModelSVAT>();
        while (true) {            
            ModelSVAT svat = new ModelSVAT();
            impSvat.inputSVAT(svat);
            listSvat.add(svat);
            System.out.println("Press any key to continue or q to go back menu");
            String choice = new Scanner(System.in).nextLine();
            if(choice.equals("q")){
                break;
            }
        }
        
        return listSvat;  
    }

    @Override
    public void infoListSVAT(List<ModelSVAT> listSVAT) {
        
        for(ModelSVAT modelSvat : listSVAT){
            impSvat.infoSVAT(modelSvat);
        }
    }

    @Override
    public List<ModelSVMM> inputListSVMM() {
        List<ModelSVMM> listSvmm = new ArrayList<ModelSVMM>();
        while (true) {            
            ModelSVMM svmm = new ModelSVMM();
            impSVMM.inputSVMM(svmm);
            listSvmm.add(svmm);
            System.out.println("Press any key to continue or q to go back menu");
            String choice = new Scanner(System.in).nextLine();
            if(choice.equals("q")){
                break;
            }
        }
        
        return listSvmm; 
    }

    @Override
    public void infoListSVMM(List<ModelSVMM> listSVMM) {
        for(ModelSVMM modelSvmm : listSVMM){
            impSVMM.infoSVMM(modelSvmm);
        }
    }
    
}
