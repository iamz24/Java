/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg.de06.service;

import java.util.List;
import pkg.de06.model.ModelSVAT;
import pkg.de06.model.ModelSVMM;

/**
 *
 * @author GF63
 */
public interface ServiceList {
    List<ModelSVAT> inputListSVAT();
    void infoListSVAT(List<ModelSVAT> listSVAT);
    List<ModelSVMM> inputListSVMM();
    void infoListSVMM(List<ModelSVMM> listSVMM);
}
