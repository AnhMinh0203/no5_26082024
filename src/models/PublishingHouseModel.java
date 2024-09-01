/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class PublishingHouseModel {

    public PublishingHouseModel() {
    }

    public PublishingHouseModel(String Ma_NXB, String Ten_NXB) {
        this.Ma_NXB = Ma_NXB;
        this.Ten_NXB = Ten_NXB;
    }

    public String getMa_NXB() {
        return Ma_NXB;
    }

    public void setMa_NXB(String Ma_NXB) {
        this.Ma_NXB = Ma_NXB;
    }

    public String getTen_NXB() {
        return Ten_NXB;
    }

    public void setTen_NXB(String Ten_NXB) {
        this.Ten_NXB = Ten_NXB;
    }
    public String Ma_NXB;
    public String Ten_NXB;
}
