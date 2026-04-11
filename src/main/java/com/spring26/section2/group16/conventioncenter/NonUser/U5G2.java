package com.spring26.section2.group16.conventioncenter.NonUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class U5G2 {
    private String Hall;
    private LocalDate date;
    private String HallName;
    private String Status;
    private String AvailableStaff;
    private String Event;
    private Integer PaymentID;
    private Integer Amount;
    private String InvoiceName;
    private String UserName;
    private List<U5G2> databaseArray5 = new ArrayList<>();

    public U5G2(String hall, LocalDate date, String hallName, String status, String availableStaff, String event, Integer paymentID, Integer amount, String invoiceName, String userName) {
        Hall = hall;
        this.date = date;
        HallName = hallName;
        Status = status;
        AvailableStaff = availableStaff;
        Event = event;
        PaymentID = paymentID;
        Amount = amount;
        InvoiceName = invoiceName;
        UserName = userName;
    }

    public String getHall() {
        return Hall;
    }

    public void setHall(String hall) {
        Hall = hall;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHallName() {
        return HallName;
    }

    public void setHallName(String hallName) {
        HallName = hallName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAvailableStaff() {
        return AvailableStaff;
    }

    public void setAvailableStaff(String availableStaff) {
        AvailableStaff = availableStaff;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public Integer getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(Integer paymentID) {
        PaymentID = paymentID;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getInvoiceName() {
        return InvoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        InvoiceName = invoiceName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "U5G2{" +
                "Hall='" + Hall + '\'' +
                ", date=" + date +
                ", HallName='" + HallName + '\'' +
                ", Status='" + Status + '\'' +
                ", AvailableStaff='" + AvailableStaff + '\'' +
                ", Event='" + Event + '\'' +
                ", PaymentID=" + PaymentID +
                ", Amount=" + Amount +
                ", InvoiceName='" + InvoiceName + '\'' +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
