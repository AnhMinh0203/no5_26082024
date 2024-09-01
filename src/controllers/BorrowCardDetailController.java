/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.CallableStatement;
import models.BorrowCardDetailModel;
import models.BorrowCardModel;

/**
 *
 * @author nguye
 */
public class BorrowCardDetailController extends ConnectToSql {
    
    public boolean InsertCTMT(BorrowCardDetailModel model) {
        boolean result = false;
        String Query = "Insert into ql_thuvien.chi_tiet_muon_tra (MaSach, MaMT, Ngay_Muon, Ngay_Tra, Tinh_Trang_Sach, Da_Tra, SoLuong, thoi_han ) values (?,?,?,?,?,?,?,?)";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, model.MaSach);
            callableStatement.setString(2, model.MaMT);
            callableStatement.setString(3, model.Ngay_Muon);
            callableStatement.setString(4, model.Ngay_Tra);
            callableStatement.setString(5, model.Tinh_Trang_Sach);
            callableStatement.setString(6, model.Da_Tra);
            callableStatement.setInt(7, model.SoLuong);
            callableStatement.setString(8, model.thoi_han);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
}
