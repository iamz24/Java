/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg.dic.service;

import java.io.IOException;
import java.util.Map;
import pkg.dic.model.ModelDic;

/**
 *
 * @author GF63
 */
public interface ServiceMap {
    Map<String, ModelDic> inputMap();
    void infoMap (Map<String, ModelDic> mapDic);
    void findMap (Map<String, ModelDic> mapDic);
    void luuFile (Map<String, ModelDic> mapDic) throws IOException;
}
