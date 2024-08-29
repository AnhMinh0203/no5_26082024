/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author leanh
 */
public class EmployeeModel {
    public String idEmployee;
    public String name;
    public String dob;
    public String phoneNumber;
    public String position;
    public String CMND;

    public EmployeeModel(String idEmployee, String name, String dob, String phoneNumber, String position, String CMND) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.CMND = CMND;
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
}
