
package models;

public class EmployeeModel {
    public String idEmployee;
    public String name;
    public String dob;
    public String phoneNumber;
    public String position;
    public String CMND;
    public String login_name;

    public EmployeeModel(String idEmployee, String name, String dob, String phoneNumber, String position, String CMND,String login_name) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.CMND = CMND;
        this.login_name = login_name;
    }

    public EmployeeModel() {
    }
    
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
    
    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }
}
