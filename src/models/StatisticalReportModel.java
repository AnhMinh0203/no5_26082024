
package models;

public class StatisticalReportModel {
    public String idBook;
    public String idLoanReturn;
    public String borrowDate;
    public String returnDate;
    public String duaDate;
    public String bookStatus;
    public String returnBook;
    public int amount;

    public StatisticalReportModel(String idBook, String idLoanReturn, String borrowDate, String returnDate, String bookStatus,String returnBook,  int amount, String duaDate) {
        this.idBook = idBook;
        this.idLoanReturn = idLoanReturn;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.duaDate = duaDate;
        this.bookStatus = bookStatus;
        this.returnBook = returnBook;
        this.amount = amount;
    }

    public StatisticalReportModel() {
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdLoanReturn() {
        return idLoanReturn;
    }

    public void setIdLoanReturn(String idLoanReturn) {
        this.idLoanReturn = idLoanReturn;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getDuaDate() {
        return duaDate;
    }

    public void setDuaDate(String duaDate) {
        this.duaDate = duaDate;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(String returnBook) {
        this.returnBook = returnBook;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
