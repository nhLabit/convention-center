package com.spring26.section2.group16.conventioncenter.NonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G4 implements Serializable {
    private int numberOfGuest, bookingID;
    private String hallName;
    private LocalDate bookingDate;

    public U4G4(int numberOfGuest, int bookingID, String hallName, LocalDate bookingDate) {
        this.numberOfGuest = numberOfGuest;
        this.bookingID = bookingID;
        this.hallName = hallName;
        this.bookingDate = bookingDate;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "U4G4{" +
                "numberOfGuest=" + numberOfGuest +
                ", bookingID=" + bookingID +
                ", hallName='" + hallName + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
