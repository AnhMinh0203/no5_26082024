/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.BookModel;
import models.BorrowCardModel;
import models.EmployeeModel;

/**
 *
 * @author nguye
 */
public class BorrowCardController extends ConnectToSql {
    
    public List<EmployeeModel> getAllEmployee() {
        List<EmployeeModel> listData = new ArrayList<>();
        String query = "select * from nhan_vien";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String Ma_NV = result.getString(1); 
                String Ten_NV = result.getString(2);
                String Ngay_Sinh = result.getString(3); 
                String So_DT = result.getString(4);
                String Chuc_Vu = result.getString(5); 
                String CMND = result.getString(6); 
                String Ten_DN = result.getString(7);
                
                EmployeeModel employeeModel = new EmployeeModel(Ma_NV, Ten_NV, Ngay_Sinh, So_DT, Chuc_Vu, CMND, Ten_DN);
                listData.add(employeeModel);
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<BorrowCardModel> getAll() {
        List<BorrowCardModel> listData = new ArrayList<>();
        String query = "select * from muon_tra";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String Ma_MT = result.getString(1); 
                String Ma_DG = result.getString(2);
                String Ten_DG = result.getString(3); 
                String Lop = result.getString(4);
                String So_DT = result.getString(5); 
                String Ma_NV = result.getString(6); 
                String Ten_NV = result.getString(7);
                Integer So_Luong = result.getInt(8);
                BorrowCardModel borrowCardModel = new BorrowCardModel(Ma_MT, Ma_DG, Ten_DG, Lop, So_DT, Ma_NV, Ten_NV, So_Luong);
                listData.add(borrowCardModel);
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public boolean InsertMT(BorrowCardModel model) {
        boolean result = false;
        String Query = "Insert into ql_thuvien.muon_tra (Ma_MT, Ma_DG, Ten_DG, Lop, So_DT, Ma_NV, Ten_NV, So_Luong ) values (?,?,?,?,?,?,?,?)";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, model.Ma_MT);
            callableStatement.setString(2, model.Ma_DG);
            callableStatement.setString(3, model.Ten_DG);
            callableStatement.setString(4, model.Lop);
            callableStatement.setString(5, model.So_DT);
            callableStatement.setString(6, model.Ma_NV);
            callableStatement.setString(7, model.Ten_NV);
            callableStatement.setInt(8, model.So_luong);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    public String AutoID(String code, String tableName, String idColumn) {
        int count = 0;
        String nextID1 = null;

        try {
            // Thực hiện thủ tục lưu trữ để lấy ID mới nhất
            CallableStatement cmd = con.prepareCall("{call autoID(?, ?)}");
            cmd.setString(1, tableName);
            cmd.setString(2, idColumn);
            ResultSet rs = cmd.executeQuery();

            String lastestID = null;
            if (rs.next()) {
                lastestID = rs.getString(1);
            }

            int nextID = Integer.parseInt(lastestID.substring(2)) + 1;
            nextID1 = code + String.format("%03d", nextID);

            do {
                // Thực hiện thủ tục lưu trữ để đếm số lượng ID trùng
                CallableStatement cmd1 = con.prepareCall("{call count_ID(?, ?, ?)}");
                cmd1.setString(1, tableName);
                cmd1.setString(2, idColumn);
                cmd1.setString(3, nextID1);
                ResultSet rs1 = cmd1.executeQuery();

                if (rs1.next()) {
                    count = rs1.getInt(1);
                }

                // Nếu mã đã được sử dụng, tăng giá trị số thứ tự lên và tạo mã mới
                if (count > 0) {
                    nextID++;
                    nextID1 = code + String.format("%03d", nextID);
                }

            } while (count > 0);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
        return nextID1;
    }
    
    public boolean Delete(String Id) {
        boolean result = false;
        String Query = "Delete from ql_thuvien.chi_tiet_muon_tra where MaMT = ?";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, Id);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0){
                String Query1 = "Delete from ql_thuvien.muon_tra where Ma_MT = ?";
                try(CallableStatement callableStatement1 = con.prepareCall(Query1)){
                    callableStatement1.setString(1, Id);
                    int RowsAffect1 = callableStatement1.executeUpdate();
                    if(RowsAffect1 > 0){
                        result = true;
                    }
                    else result = false;

                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
}
