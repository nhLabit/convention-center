package com.spring26.section2.group16.conventioncenter.NonUser;

public class U3G7 {
    private String staffName, Role;

    public U3G7(String staffName, String role) {
        this.staffName = staffName;
        Role = role;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "U3G7{" +
                "staffName='" + staffName + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }
}
