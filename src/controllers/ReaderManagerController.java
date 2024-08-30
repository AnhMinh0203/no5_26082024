/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.ReaderModel;

/**
 *
 * @author nguye
 */
public class ReaderManagerController extends ConnectToSql{
    public List<ReaderModel> getAll() {
        List<ReaderModel> listData = new ArrayList<>();
        String query = "Select * from ql_thuvien.doc_gia";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String Ma_DG = result.getString(1); 
                String Ten_DG = result.getString(2);
                String Lop = result.getString(3); 
                String So_DT = result.getString(4);
                String Ten_TK = result.getString(5); 
                
                ReaderModel reader = new ReaderModel (Ma_DG,Ten_DG,Lop,So_DT, Ten_TK );
                listData.add(reader);
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public ReaderModel getById(String Id) {
        ReaderModel listData = new ReaderModel();
        String query = "Select * from ql_thuvien.doc_gia where Ma_DG = ?";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            prepare.setString(1, Id);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String Ma_DG = result.getString(1); 
                String Ten_DG = result.getString(2);
                String Lop = result.getString(3); 
                String So_DT = result.getString(4);
                String Ten_TK = result.getString(5); 
                
                ReaderModel reader = new ReaderModel (Ma_DG,Ten_DG,Lop,So_DT, Ten_TK );
                listData = reader;
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    } 
    
    public boolean update(ReaderModel model) {
        boolean result = false;
        String Query = "Update ql_thuvien.doc_gia set Ten_DG = ?, Lop = ?, So_DT= ? where Ma_DG = ? ";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, model.Ten_DG);
            callableStatement.setString(2, model.Lop);
            callableStatement.setString(3, model.So_DT);
            callableStatement.setString(4, model.Ma_DG);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    public boolean add(ReaderModel model) {
        boolean result = false;
        String Query = "Insert into ql_thuvien.doc_gia (Ma_DG,Ten_DG, Lop, So_DT ) values (?,?,?,?)";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, model.Ma_DG);
            callableStatement.setString(2, model.Ten_DG);
            callableStatement.setString(3, model.Lop);
            callableStatement.setString(4, model.So_DT);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    } 
    
    public boolean delete(String Id) {
        boolean result = false;
        String Query = "Delete from ql_thuvien.doc_gia where Ma_DG = ?";
        try(CallableStatement callableStatement = con.prepareCall(Query)){
            callableStatement.setString(1, Id);
            int RowsAffect = callableStatement.executeUpdate();
            if(RowsAffect > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    public static void main(String[] args){
        ReaderManagerController a = new ReaderManagerController();
        List<ReaderModel> listData = new ArrayList<>();
        listData = a.getAll();
        for (ReaderModel readerModel : listData) {
            System.out.println(readerModel.Ma_DG);
        }
    }
    
}
