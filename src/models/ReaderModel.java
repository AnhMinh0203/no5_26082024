/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class ReaderModel {

    public String getMa_DG() {
        return Ma_DG;
    }

    public void setMa_DG(String Ma_DG) {
        this.Ma_DG = Ma_DG;
    }

    public String getTen_DG() {
        return Ten_DG;
    }

    public void setTen_DG(String Ten_DG) {
        this.Ten_DG = Ten_DG;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getSo_DT() {
        return So_DT;
    }

    public void setSo_DT(String So_DT) {
        this.So_DT = So_DT;
    }

    public String getTen_TK() {
        return Ten_TK;
    }

    public void setTen_TK(String Ten_TK) {
        this.Ten_TK = Ten_TK;
    }

    public ReaderModel(String Ma_DG, String Ten_DG, String Lop, String So_DT, String Ten_TK) {
        this.Ma_DG = Ma_DG;
        this.Ten_DG = Ten_DG;
        this.Lop = Lop;
        this.So_DT = So_DT;
        this.Ten_TK = Ten_TK;
    }

    public ReaderModel() {
    }
    
    public String Ma_DG;
    public String Ten_DG;
    public String Lop;
    public String So_DT;
    public String Ten_TK;
}
