package com.spring26.section2.group16.conventioncenter.NonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class Browser implements Serializable {
    private int hallCapacity;
    private String hallName, roleName, staffName, successMessage;
    private LocalDate bookingDate;

    public Browser(int hallCapacity, String hallName, String roleName, String staffName, String successMessage, LocalDate bookingDate) {
        this.hallCapacity = hallCapacity;
        this.hallName = hallName;
        this.roleName = roleName;
        this.staffName = staffName;
        this.successMessage = successMessage;
        this.bookingDate = bookingDate;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "hallCapacity=" + hallCapacity +
                ", hallName='" + hallName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", successMessage='" + successMessage + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}








