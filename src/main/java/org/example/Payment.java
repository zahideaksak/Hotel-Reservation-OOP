package org.example;

import java.util.Date;

public class Payment {

    private double amount;

    private Date date;

    private EPaymentMethod method;

    private Guest guest;

    private Hotel hotel;

    public Payment() {
    }

    public Payment(double amount, Date date, EPaymentMethod method, Guest guest, Hotel hotel) {
        super();
        this.amount = amount;
        this.date = date;
        this.method = method;
        this.guest = guest;
        this.hotel = hotel;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EPaymentMethod getMethod() {
        return method;
    }

    public void setMethod(EPaymentMethod method) {
        this.method = method;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}