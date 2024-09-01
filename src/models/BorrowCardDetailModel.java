/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguye
 */
public class BorrowCardDetailModel {

    public BorrowCardDetailModel() {
    }

    public BorrowCardDetailModel(String MaSach, String MaMT, String Ngay_Muon, String Ngay_Tra, String Tinh_Trang_Sach, String Da_Tra, int SoLuong, String thoi_han) {
        this.MaSach = MaSach;
        this.MaMT = MaMT;
        this.Ngay_Muon = Ngay_Muon;
        this.Ngay_Tra = Ngay_Tra;
        this.Tinh_Trang_Sach = Tinh_Trang_Sach;
        this.Da_Tra = Da_Tra;
        this.SoLuong = SoLuong;
        this.thoi_han = thoi_han;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getMaMT() {
        return MaMT;
    }

    public void setMaMT(String MaMT) {
        this.MaMT = MaMT;
    }

    public String getNgay_Muon() {
        return Ngay_Muon;
    }

    public void setNgay_Muon(String Ngay_Muon) {
        this.Ngay_Muon = Ngay_Muon;
    }

    public String getNgay_Tra() {
        return Ngay_Tra;
    }

    public void setNgay_Tra(String Ngay_Tra) {
        this.Ngay_Tra = Ngay_Tra;
    }

    public String getTinh_Trang_Sach() {
        return Tinh_Trang_Sach;
    }

    public void setTinh_Trang_Sach(String Tinh_Trang_Sach) {
        this.Tinh_Trang_Sach = Tinh_Trang_Sach;
    }

    public String getDa_Tra() {
        return Da_Tra;
    }

    public void setDa_Tra(String Da_Tra) {
        this.Da_Tra = Da_Tra;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getThoi_han() {
        return thoi_han;
    }

    public void setThoi_han(String thoi_han) {
        this.thoi_han = thoi_han;
    }
    public String MaSach;
    public String MaMT;
    public String Ngay_Muon;
    public String Ngay_Tra;
    public String Tinh_Trang_Sach;
    public String Da_Tra;
    public int SoLuong;
    public String thoi_han;
}
