package com.spring26.section2.group16.conventioncenter.NonUser;

import java.time.LocalDate;

public class Database {
    private int userID, userName, userRole, hallCapacity;
    private String maintenanceCategory, hallName, roleName, staffName, serviceName, reviewerName;
    private LocalDate bookingDate;

    public Database(int userID, int userName, int userRole, int hallCapacity, String maintenanceCategory, String hallName, String roleName, String staffName, String serviceName, String reviewerName, LocalDate bookingDate) {
        this.userID = userID;
        this.userName = userName;
        this.userRole = userRole;
        this.hallCapacity = hallCapacity;
        this.maintenanceCategory = maintenanceCategory;
        this.hallName = hallName;
        this.roleName = roleName;
        this.staffName = staffName;
        this.serviceName = serviceName;
        this.reviewerName = reviewerName;
        this.bookingDate = bookingDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public String getMaintenanceCategory() {
        return maintenanceCategory;
    }

    public void setMaintenanceCategory(String maintenanceCategory) {
        this.maintenanceCategory = maintenanceCategory;
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Database{" +
                "userID=" + userID +
                ", userName=" + userName +
                ", userRole=" + userRole +
                ", hallCapacity=" + hallCapacity +
                ", maintenanceCategory='" + maintenanceCategory + '\'' +
                ", hallName='" + hallName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
