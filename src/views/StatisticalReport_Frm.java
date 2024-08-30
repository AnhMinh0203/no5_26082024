
package views;

import controllers.StatisticalReportController;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.StatisticalReportModel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;


public class StatisticalReport_Frm extends javax.swing.JFrame {

    private StatisticalReportController controller_report;
    public StatisticalReport_Frm() {
        initComponents();
        controller_report = new StatisticalReportController();
        List<StatisticalReportModel> listCustomer = controller_report.loadInforCustomer();
        DefaultTableModel model = (DefaultTableModel)jTbl_list_return_detail.getModel();
        for(StatisticalReportModel o : listCustomer){
            model.addRow(new Object[] {
                o.getIdBook(),
                o.getIdLoanReturn(),
                o.getBorrowDate(),
                o.getDuaDate(),
                o.getReturnDate(),
                o.getBookStatus(),
                o.getAmount(),
                o.getReturnBook(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_export_excel = new javax.swing.JButton();
        jButton_due_date = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_list_return_detail = new javax.swing.JTable();
        jTextField_input_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Báo cáo thống kê");

        jButton_export_excel.setText("Xuất Excel");
        jButton_export_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_export_excelActionPerformed(evt);
            }
        });

        jButton_due_date.setText("Sách trễ hạn");
        jButton_due_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_due_dateActionPerformed(evt);
            }
        });

        jTbl_list_return_detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Mã mượn trả", "Ngày mượn", "Thời hạn", "Ngày trả", "Tình trạng", "Số lượng", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbl_list_return_detail);

        jTextField_input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_input_searchActionPerformed(evt);
            }
        });

        jButton_search.setText("Tìm kiếm");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_save.setText("Lưu");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_home.setText("Trở lại");

        jLabel2.setText("Nhập mã mượn trả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_home, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(229, 229, 229)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField_input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(jButton_due_date, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_export_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_export_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_due_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        controller_report = new StatisticalReportController();
        String idBorrowCard = jTextField_input_search.getText();
        List<StatisticalReportModel> listCustomer = controller_report.search_detail_return(idBorrowCard);
        
        DefaultTableModel model = (DefaultTableModel) jTbl_list_return_detail.getModel();
        model.setRowCount(0);
         
        for (StatisticalReportModel o : listCustomer) {
            model.addRow(new Object[] {
                o.getIdBook(),
                o.getIdLoanReturn(),
                o.getBorrowDate(),
                o.getDuaDate(),
                o.getReturnDate(),
                o.getBookStatus(),
                o.getAmount(),
                o.getReturnBook()
            });
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jTextField_input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_input_searchActionPerformed
      
    }//GEN-LAST:event_jTextField_input_searchActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_due_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_due_dateActionPerformed
        controller_report = new StatisticalReportController();
        String idBorrowCard = jTextField_input_search.getText();
        List<StatisticalReportModel> listCustomer = controller_report.list_dua_date_books();
        
        DefaultTableModel model = (DefaultTableModel) jTbl_list_return_detail.getModel();
        model.setRowCount(0);
         
        for (StatisticalReportModel o : listCustomer) {
            model.addRow(new Object[] {
                o.getIdBook(),
                o.getIdLoanReturn(),
                o.getBorrowDate(),
                o.getDuaDate(),
                o.getReturnDate(),
                o.getBookStatus(),
                o.getAmount(),
                o.getReturnBook()
            });
        }
    }//GEN-LAST:event_jButton_due_dateActionPerformed

    private void jButton_export_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_export_excelActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTbl_list_return_detail.getModel();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }

        // Thêm dữ liệu vào bảng
        for (int i = 0; i < model.getRowCount(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                Object value = model.getValueAt(i, j);
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                } else if (value instanceof Double) {
                    cell.setCellValue((Double) value);
                }
            }
        }

        // Lưu file Excel
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File fileToSave = fileChooser.getSelectedFile();
        if (!fileToSave.getAbsolutePath().endsWith(".xlsx")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".xlsx");
        }
        try (FileOutputStream fileOut = new FileOutputStream(fileToSave)) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Export successful!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error exporting file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_export_excelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticalReport_Frm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_due_date;
    private javax.swing.JButton jButton_export_excel;
    private javax.swing.JButton jButton_home;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbl_list_return_detail;
    private javax.swing.JTextField jTextField_input_search;
    // End of variables declaration//GEN-END:variables
}
