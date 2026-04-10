package com.spring26.section2.group16.conventioncenter.NonUser;

public class System {
    private int hallCapacity, servicePrice;
    private String maintenanceCategory, userRole, hallName, successMessage, serviceName, reviewerName;

    public System(int hallCapacity, int servicePrice, String maintenanceCategory, String userRole, String hallName, String successMessage, String serviceName, String reviewerName) {
        this.hallCapacity = hallCapacity;
        this.servicePrice = servicePrice;
        this.maintenanceCategory = maintenanceCategory;
        this.userRole = userRole;
        this.hallName = hallName;
        this.successMessage = successMessage;
        this.serviceName = serviceName;
        this.reviewerName = reviewerName;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getMaintenanceCategory() {
        return maintenanceCategory;
    }

    public void setMaintenanceCategory(String maintenanceCategory) {
        this.maintenanceCategory = maintenanceCategory;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
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

    @Override
    public String toString() {
        return "System{" +
                "hallCapacity=" + hallCapacity +
                ", servicePrice=" + servicePrice +
                ", maintenanceCategory='" + maintenanceCategory + '\'' +
                ", userRole='" + userRole + '\'' +
                ", hallName='" + hallName + '\'' +
                ", successMessage='" + successMessage + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                '}';
    }
}
