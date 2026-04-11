package com.spring26.section2.group16.conventioncenter.NonUser;

public class U4G1 {
    private String hallName;
    private int hallCapacity;

    public U4G1(String hallName, int hallCapacity) {
        this.hallName = hallName;
        this.hallCapacity = hallCapacity;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    @Override
    public String toString() {
        return "U4G1{" +
                "hallName='" + hallName + '\'' +
                ", hallCapacity=" + hallCapacity +
                '}';
    }
}
