
package controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.StatisticalReportModel;

/**
 *
 * @author leanh
 */
public class StatisticalReportController extends ConnectToSql{
    public List<StatisticalReportModel> loadInforCustomer(){
        
        List<StatisticalReportModel> list_detai_return = new ArrayList<>();
        String query = "select * from chi_tiet_muon_tra";
        try{
            PreparedStatement prepare = con.prepareStatement(query); 
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                list_detai_return.add(new StatisticalReportModel(result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getInt(7),
                        result.getString(8)));
            }
            return list_detai_return;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
    
    public List<StatisticalReportModel> search_detail_return (String idBorrowCard){
        List<StatisticalReportModel> list_detai_return = new ArrayList<>();
         String query;

        if (idBorrowCard.isEmpty()) {
            query = "SELECT * FROM chi_tiet_muon_tra";
        } else {
            query = "SELECT * FROM chi_tiet_muon_tra WHERE MaMT = ?";
        }
        
        try{
            PreparedStatement prepare = con.prepareStatement(query); 
           if (!idBorrowCard.isEmpty()) {
                prepare.setString(1, idBorrowCard); 
            }
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                list_detai_return.add(new StatisticalReportModel(result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getInt(7),
                        result.getString(8)));
            }
            return list_detai_return;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<StatisticalReportModel> list_dua_date_books(){
        
        List<StatisticalReportModel> list_detai_return = new ArrayList<>();
        String query = "SELECT * FROM chi_tiet_muon_tra " +
                   "WHERE STR_TO_DATE(Ngay_Tra, '%d/%m/%Y') > STR_TO_DATE(Thoi_Han, '%d/%m/%Y')";
        try{
            PreparedStatement prepare = con.prepareStatement(query); 
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                list_detai_return.add(new StatisticalReportModel(result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getInt(7),
                        result.getString(8)));
            }
            return list_detai_return;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
