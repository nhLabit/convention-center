package com.spring26.section2.group16.conventioncenter.NonUser;

public class PaymentGateway {
    private int servicePrice, payableAmount;
    private String paymentMethod;

    public PaymentGateway(int servicePrice, int payableAmount, String paymentMethod) {
        this.servicePrice = servicePrice;
        this.payableAmount = payableAmount;
        this.paymentMethod = paymentMethod;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(int payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentGateway{" +
                "servicePrice=" + servicePrice +
                ", payableAmount=" + payableAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
