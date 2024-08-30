package controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.EmployeeModel;

public class EmployeeController extends ConnectToSql{
    public boolean login(String name_login, String password) {
        try {
            String query = "select * from tai_khoan where Ten_TK = ? and Mat_Khau = ?";

            PreparedStatement prepare = con.prepareStatement(query); 
            prepare.setString(1, name_login);
            prepare.setString (2,password);

            ResultSet result = prepare.executeQuery();
            if(result.next()){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public String getIdEmployee(){
        String newId = "";
        try{
            String query = "SELECT Ma_NV FROM nhan_vien ORDER BY Ma_NV DESC LIMIT 1";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String lastId = rs.getString("Ma_NV");
                int numericPart = Integer.parseInt(lastId.substring(2));
                numericPart++;
                newId = String.format("NV%03d", numericPart);
            } else {
                newId = "NV001";
            }
            
        }catch (Exception ex) {
            ex.printStackTrace();
        }
       
        return newId;
    }
    public boolean signUp(EmployeeModel emp,String password) {
        String Ma_NV = getIdEmployee();
        try {
             String query_table_employee = "INSERT INTO nhan_vien (Ma_NV,Ten_NV, Ngay_Sinh, So_DT, Chuc_Vu, CMND,Ten_DN) "
                     + "VALUES (?, ?, ?, ?, ?, ?,?)";      
            PreparedStatement prepare_emp = con.prepareStatement(query_table_employee); 
            prepare_emp.setString(1, Ma_NV);
            prepare_emp.setString(2, emp.name);
            prepare_emp.setString(3, emp.dob);
            prepare_emp.setString(4, emp.phoneNumber); 
            prepare_emp.setString(5, emp.position);
            prepare_emp.setString(6, emp.CMND);
            prepare_emp.setString(7, emp.login_name);

            int rowsAffected_emp = prepare_emp.executeUpdate();
           
            String query_table_account = "INSERT INTO tai_khoan (Ten_TK, Mat_Khau, Quyen) "
                     + "VALUES (?, ?, ?)";
            PreparedStatement prepare_account = con.prepareStatement(query_table_account); 
            prepare_account.setString(1, emp.login_name);
            prepare_account.setString(2, password);
            prepare_account.setString(3, "2");

            int rowsAffected_acc = prepare_account.executeUpdate();
            if(rowsAffected_emp > 0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
