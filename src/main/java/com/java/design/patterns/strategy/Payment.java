package com.java.design.patterns.strategy;

import java.util.Date;

public class Payment {
    private Date dateCreated;
    private Date lastUpdated;
    Integer amount;
    Booking booking;

    public Payment(Date dateCreated, Date lastUpdated, Integer amount, Booking booking) {
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
        this.amount = amount;
        this.booking = booking;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Default Payment successful";
    }
}
