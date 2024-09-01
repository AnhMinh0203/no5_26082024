/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class BorrowCardModel {

    public BorrowCardModel() {
    }

    public BorrowCardModel(String Ma_MT, String Ma_DG, String Ten_DG, String Lop, String So_DT, String Ma_NV, String Ten_NV, int So_luong) {
        this.Ma_MT = Ma_MT;
        this.Ma_DG = Ma_DG;
        this.Ten_DG = Ten_DG;
        this.Lop = Lop;
        this.So_DT = So_DT;
        this.Ma_NV = Ma_NV;
        this.Ten_NV = Ten_NV;
        this.So_luong = So_luong;
    }

    public String getMa_MT() {
        return Ma_MT;
    }

    public void setMa_MT(String Ma_MT) {
        this.Ma_MT = Ma_MT;
    }

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

    public String getMa_NV() {
        return Ma_NV;
    }

    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public void setTen_NV(String Ten_NV) {
        this.Ten_NV = Ten_NV;
    }

    public int getSo_luong() {
        return So_luong;
    }

    public void setSo_luong(int So_luong) {
        this.So_luong = So_luong;
    }
    public String Ma_MT;
    public String Ma_DG;
    public String Ten_DG;
    public String Lop;
    public String So_DT;
    public String Ma_NV;
    public String Ten_NV;
    public int So_luong;

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public BorrowCardModel(String Ma_MT, String Ma_DG, String Ten_DG, String Lop, String So_DT, String Ma_NV, String Ten_NV, int So_luong, String MaSach) {
        this.Ma_MT = Ma_MT;
        this.Ma_DG = Ma_DG;
        this.Ten_DG = Ten_DG;
        this.Lop = Lop;
        this.So_DT = So_DT;
        this.Ma_NV = Ma_NV;
        this.Ten_NV = Ten_NV;
        this.So_luong = So_luong;
        this.MaSach = MaSach;
    }
    public String MaSach;
}
