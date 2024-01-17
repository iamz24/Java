/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg.thi.service;

import java.io.IOException;
import java.util.List;
import pkg.thi.model.ModelStudent;

/**
 *
 * @author GF63
 */
public interface ServiceList {
    List<ModelStudent> inputList();
    void infoList(List<ModelStudent> listStudent);
    void luuFile(List<ModelStudent> listStudent) throws IOException;
}
