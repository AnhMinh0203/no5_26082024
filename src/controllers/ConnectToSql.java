package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectToSql {
    Connection con;

    public ConnectToSql() {
        try {
            // Load driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL kết nối MySQL
            String url = "jdbc:mysql://localhost:3306/ql_thuvien";  // Chỉnh sửa để sử dụng MySQL (localhost, cổng 3306, tên cơ sở dữ liệu là library_management)

            // Tài khoản và mật khẩu MySQL
            String user = "root";  // Chỉnh sửa thành tài khoản MySQL của bạn
            String pass = "Abc@123456789";  // Chỉnh sửa thành mật khẩu MySQL của bạn

            // Kết nối với cơ sở dữ liệu
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            // Ném lại ngoại lệ để hiển thị thông tin chi tiết của lỗi
            throw new RuntimeException("Error connecting to the database: " + ex.getMessage(), ex);
        }
    }

    public static void main(String[] args) {
        ConnectToSql connect = new ConnectToSql();

        if (connect.con != null) {
            try {
                System.out.println("Kết nối thành công!");

                // Truy vấn dữ liệu
                String query = "SELECT * FROM ql_thuvien.doc_gia";
                PreparedStatement prepare = connect.con.prepareStatement(query);

                ResultSet result = prepare.executeQuery();

                if (result.next()) {
                    System.out.println("Dữ liệu đã được tìm thấy.");
                } else {
                    System.out.println("Không có dữ liệu.");
                }

                result.close();
                prepare.close();
            } catch (SQLException ex) {
                // Ném lại ngoại lệ để hiển thị thông tin chi tiết của lỗi
                throw new RuntimeException("Error executing query: " + ex.getMessage(), ex);
            }
        } else {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
        }
    }
}
