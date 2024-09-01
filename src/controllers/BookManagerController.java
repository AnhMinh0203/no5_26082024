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
import models.AuthorModel;
import models.BookModel;
import models.CategoryModel;
import models.PublishingHouseModel;
import models.ReaderModel;

/**
 *
 * @author nguye
 */
public class BookManagerController extends ConnectToSql {
    public List<BookModel> getAll() {
        List<BookModel> listData = new ArrayList<>();
        String query = "Select s.MaSach,s.TenSach,tg.Ma_TG,tg.Ten_TG,tl.Ma_TL,tl.Ten_TL,nxb.Ma_NXB,nxb.Ten_NXB,s.Nam_XB,s.Tinh_trang_Sach,s.So_Luong,s.Da_Muon,s.Ton_Kho  from ql_thuvien.sach s "
                + "join tac_gia tg on s.Ma_TG = tg.Ma_TG "
                + "join the_loai tl on tl.Ma_TL = s.Ma_TL "
                + "join nha_xuat_ban nxb on nxb.Ma_NXB = s.Ma_NXB ";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String MaSach = result.getString(1); 
                String TenSach = result.getString(2);
                String Ma_TG = result.getString(3); 
                String Ten_TG = result.getString(4);
                String Ma_TL = result.getString(5); 
                String Ten_TL = result.getString(6); 
                String Ma_NXB = result.getString(7);
                String Ten_NXB = result.getString(8); 
                String Nam_XB = result.getString(9);
                String Tinh_trang_Sach = result.getString(10); 
                String So_Luong = result.getString(11); 
                String Da_Muon = result.getString(12);
                String Ton_Kho = result.getString(13);
                
                BookModel book = new BookModel (MaSach, TenSach, Ma_TG, Ten_TG, Ma_TL, Ten_TL, Ma_NXB, Ten_NXB, Nam_XB, Tinh_trang_Sach, So_Luong, Da_Muon, Ton_Kho);
                listData.add(book);
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public BookModel getById(String Id) {
        BookModel listData = new BookModel();
        String query = "Select s.MaSach,s.TenSach,tg.Ma_TG,tg.Ten_TG,tl.Ma_TL,tl.Ten_TL,nxb.Ma_NXB,nxb.Ten_NXB,s.Nam_XB,s.Tinh_trang_Sach,s.So_Luong,s.Da_Muon,s.Ton_Kho  from ql_thuvien.sach s "
                + "join tac_gia tg on s.Ma_TG = tg.Ma_TG "
                + "join the_loai tl on tl.Ma_TL = s.Ma_TL "
                + "join nha_xuat_ban nxb on nxb.Ma_NXB = s.Ma_NXB where s.MaSach = ?";
        try {
            PreparedStatement prepare = con.prepareStatement(query);
            prepare.setString(1, Id);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                String MaSach = result.getString(1); 
                String TenSach = result.getString(2);
                String Ma_TG = result.getString(3); 
                String Ten_TG = result.getString(4);
                String Ma_TL = result.getString(5); 
                String Ten_TL = result.getString(6); 
                String Ma_NXB = result.getString(7);
                String Ten_NXB = result.getString(8); 
                String Nam_XB = result.getString(9);
                String Tinh_trang_Sach = result.getString(10); 
                String So_Luong = result.getString(11); 
                String Da_Muon = result.getString(12);
                String Ton_Kho = result.getString(13);
                
                BookModel book = new BookModel (MaSach, TenSach, Ma_TG, Ten_TG, Ma_TL, Ten_TL, Ma_NXB, Ten_NXB, Nam_XB, Tinh_trang_Sach, So_Luong, Da_Muon, Ton_Kho);
                listData = book;
            }
            return listData;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public boolean Update(String Id, BookModel model1) {
        boolean result = false;
        BookModel model = getById(Id);
        try{
            // NXB
            String QueryNXB = "Update ql_thuvien.nha_xuat_ban set Ten_NXB = ? where Ma_NXB = ? ";
            CallableStatement callableStatement = con.prepareCall(QueryNXB);
            callableStatement.setString(1, model1.Ten_NXB);
            callableStatement.setString(2, model.Ma_NXB);
            int RowsAffect = callableStatement.executeUpdate();
            
            //TG
            String QueryTG = "Update ql_thuvien.tac_gia set Ten_TG = ? where Ma_TG = ? ";
            CallableStatement callableStatement1 = con.prepareCall(QueryTG);
            callableStatement1.setString(1, model1.Ten_TG);
            callableStatement1.setString(2, model.Ma_TG);
            int RowsAffect1 = callableStatement1.executeUpdate();
            
            //TL
                String QueryTL = "Update ql_thuvien.the_loai set Ten_TL = ? where Ma_TL = ? ";
            CallableStatement callableStatement2 = con.prepareCall(QueryTL);
            callableStatement2.setString(1, model1.Ten_TL);
            callableStatement2.setString(2, model.Ma_TL);
            int RowsAffect2 = callableStatement2.executeUpdate();
            
            //Sach
            String QuerySach = "Update ql_thuvien.sach set TenSach = ?, Ma_TG = ?, Ten_TG = ?, Ma_TL = ?, Ten_TL = ?, Ma_NXB = ?, Ten_NXB = ?, Nam_XB = ?, Tinh_trang_Sach = ?, So_Luong = ?, Ton_Kho = ? where MaSach = ? ";
            CallableStatement callableStatement3 = con.prepareCall(QuerySach);
            callableStatement3.setString(1, model1.TenSach);
            callableStatement3.setString(2, model.Ma_TG);
            callableStatement3.setString(3, model1.Ten_TG);
            callableStatement3.setString(4, model.Ma_TL);
            callableStatement3.setString(5, model1.Ten_TL);
            callableStatement3.setString(6, model.Ma_NXB);
            callableStatement3.setString(7, model1.Ten_NXB);
            callableStatement3.setString(8, model1.Nam_XB);
            callableStatement3.setString(9, null);
            callableStatement3.setString(10, model1.So_Luong);
            callableStatement3.setString(11, String.valueOf(Integer.parseInt(model1.So_Luong) - Integer.parseInt(model.Da_Muon)));
            callableStatement3.setString(12, Id);
            int RowsAffect3 = callableStatement3.executeUpdate();
            
            if(RowsAffect > 0 && RowsAffect1 > 0 && RowsAffect2 > 0 && RowsAffect3 > 0) result = true;
            else result = false;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    public boolean Insert( BookModel model) {
        boolean result = false;
        PublishingHouseModel publishingHouseModel = new PublishingHouseModel();
        AuthorModel authorModel = new AuthorModel();
        CategoryModel categoryModel = new CategoryModel();
        try{
            // Kiểm tra và thêm hoặc cập nhật NXB
            String QueryNXB = "select * from ql_thuvien.nha_xuat_ban where Ten_NXB = ?";
            CallableStatement callableStatement = con.prepareCall(QueryNXB);
            callableStatement.setString(1, model.Ten_NXB);
            ResultSet rsNXB = callableStatement.executeQuery();
            String MaNXB = AutoID("XB", "NHA_XUAT_BAN", "Ma_NXB");
            String MaTG = AutoID("TG", "TAC_GIA", "Ma_TG");
            String MaTL = AutoID("TL", "THE_LOAI", "Ma_TL");
            String MaSach = AutoID("MS", "SACH", "MaSach");
            if (rsNXB.next()) {
                publishingHouseModel.setMa_NXB(rsNXB.getString(1));
                publishingHouseModel.setTen_NXB(rsNXB.getString(2));
            } else {
                // Nếu không tồn tại, chèn NXB mới
                String InsertNXB = "insert into ql_thuvien.nha_xuat_ban (Ma_NXB, Ten_NXB) values (?, ?)";
                CallableStatement callableStatementInsert = con.prepareCall(InsertNXB);
                callableStatementInsert.setString(1, MaNXB);
                callableStatementInsert.setString(2, model.Ten_NXB);
                // Gọi executeUpdate để chèn
                callableStatementInsert.executeUpdate();
                publishingHouseModel.setMa_NXB(MaNXB);
                publishingHouseModel.setTen_NXB(model.Ten_NXB);
            }

            // Tương tự, thực hiện kiểm tra, chèn hoặc cập nhật cho TG
            String QueryTG = "select * from ql_thuvien.tac_gia where Ten_TG = ?";
            CallableStatement callableStatement1 = con.prepareCall(QueryTG);
            callableStatement1.setString(1, model.Ten_TG);
            ResultSet rsTG = callableStatement1.executeQuery();

            if (rsTG.next()) {
                authorModel.setMa_TG(rsTG.getString(1));
                authorModel.setTen_TG(rsTG.getString(2));
            } else {
                // Chèn TG mới
                String InsertTG = "insert into ql_thuvien.tac_gia (Ma_TG, Ten_TG) values (?, ?)";
                CallableStatement callableStatementInsert1 = con.prepareCall(InsertTG);
                callableStatementInsert1.setString(1, MaTG);
                callableStatementInsert1.setString(2, model.Ten_TG);
                callableStatementInsert1.executeUpdate();
                authorModel.setMa_TG(MaTG);
                authorModel.setTen_TG(model.Ten_TG);
            }

            // Tương tự, thực hiện kiểm tra, chèn hoặc cập nhật cho TL
            String QueryTL = "select * from ql_thuvien.the_loai where Ten_TL = ?";
            CallableStatement callableStatement2 = con.prepareCall(QueryTL);
            callableStatement2.setString(1, model.Ten_TL);
            ResultSet rsTL = callableStatement2.executeQuery();

            if (rsTL.next()) {
                categoryModel.setMa_TL(rsTL.getString(1));
                categoryModel.setTen_TL(rsTL.getString(2));
            } else {
                // Chèn TL mới
                String InsertTL = "insert into ql_thuvien.the_loai (Ma_TL, Ten_TL) values (?, ?)";
                CallableStatement callableStatementInsert2 = con.prepareCall(InsertTL);
                callableStatementInsert2.setString(1, MaTL);
                callableStatementInsert2.setString(2, model.Ten_TL);
                callableStatementInsert2.executeUpdate();
                categoryModel.setMa_TL(MaTL);
                categoryModel.setTen_TL(model.Ten_TL);
            }
            
            //Sach
            String QuerySach = "Insert into ql_thuvien.sach (MaSach, TenSach, Ma_TG, Ten_TG, Ma_TL, Ten_TL, Ma_NXB, Ten_NXB, Nam_XB,  So_Luong, Da_Muon, Ton_Kho ) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            CallableStatement callableStatement3 = con.prepareCall(QuerySach);
            callableStatement3.setString(1, MaSach);
            callableStatement3.setString(2, model.TenSach);
            callableStatement3.setString(3, authorModel.Ma_TG);
            callableStatement3.setString(4, authorModel.Ten_TG);
            callableStatement3.setString(5, categoryModel.Ma_TL);
            callableStatement3.setString(6, categoryModel.Ten_TL);
            callableStatement3.setString(7, publishingHouseModel.Ma_NXB);
            callableStatement3.setString(8, publishingHouseModel.Ten_NXB);
            callableStatement3.setString(9, model.Nam_XB);
            callableStatement3.setString(10, model.So_Luong);
            callableStatement3.setString(11, "0");
            callableStatement3.setString(12, model.So_Luong);
            int RowsAffect3 = callableStatement3.executeUpdate();
            if(RowsAffect3 > 0) result = true;
            else result = false;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    public boolean delete(String Id) {
        boolean result = false;
        String Query = "Delete from ql_thuvien.sach where MaSach = ?";
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

}
