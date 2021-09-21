package com.java.design.patterns.strategy;

import java.util.Date;

public class Booking {
    private Integer id;
    private Date dateOfBooking;
    private Payment payment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
