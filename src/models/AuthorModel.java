/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class AuthorModel {

    public AuthorModel() {
    }

    public AuthorModel(String Ma_TG, String Ten_TG) {
        this.Ma_TG = Ma_TG;
        this.Ten_TG = Ten_TG;
    }

    public String getMa_TG() {
        return Ma_TG;
    }

    public void setMa_TG(String Ma_TG) {
        this.Ma_TG = Ma_TG;
    }

    public String getTen_TG() {
        return Ten_TG;
    }

    public void setTen_TG(String Ten_TG) {
        this.Ten_TG = Ten_TG;
    }
    public String Ma_TG;
    public String Ten_TG;
}
