/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.dic.model;

import java.io.Serializable;

/**
 *
 * @author GF63
 */
public class ModelDic implements Serializable{
    private String keyWord;
    private String type;
    private String defi;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefi() {
        return defi;
    }

    public void setDefi(String defi) {
        this.defi = defi;
    }
    
    
}
