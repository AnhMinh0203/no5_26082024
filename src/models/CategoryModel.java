/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class CategoryModel {

    public CategoryModel() {
    }

    public CategoryModel(String Ma_TL, String Ten_TL) {
        this.Ma_TL = Ma_TL;
        this.Ten_TL = Ten_TL;
    }

    public String getMa_TL() {
        return Ma_TL;
    }

    public void setMa_TL(String Ma_TL) {
        this.Ma_TL = Ma_TL;
    }

    public String getTen_TL() {
        return Ten_TL;
    }

    public void setTen_TL(String Ten_TL) {
        this.Ten_TL = Ten_TL;
    }
    public String Ma_TL;
    public String Ten_TL;
}
