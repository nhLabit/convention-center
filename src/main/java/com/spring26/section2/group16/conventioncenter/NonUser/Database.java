package com.spring26.section2.group16.conventioncenter.NonUser;

import java.time.LocalDate;

public class Database {
    private int userID, hallCapacity;
    private String maintenanceCategory, hallName, roleName, staffName, serviceName, reviewerName, userRole, userName, password;
    private LocalDate bookingDate;

    public Database(String maintenanceCategory, String hallName, String roleName) {
        this.userID = userID;
        this.hallCapacity = hallCapacity;
        this.maintenanceCategory = maintenanceCategory;
        this.hallName = hallName;
        this.roleName = roleName;
        this.staffName = staffName;
        this.serviceName = serviceName;
        this.reviewerName = reviewerName;
        this.userRole = userRole;
        this.userName = userName;
        this.password = password;
        this.bookingDate = bookingDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", hallCapacity=" + hallCapacity +
                ", maintenanceCategory='" + maintenanceCategory + '\'' +
                ", hallName='" + hallName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}


//no change