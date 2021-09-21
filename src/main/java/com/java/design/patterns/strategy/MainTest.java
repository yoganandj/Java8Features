package com.java.design.patterns.strategy;

import com.java.design.patterns.strategy.services.BookingService;
import com.java.design.patterns.strategy.util.PaymentType;

import java.util.Date;

public class MainTest {
    public final static PaymentType paymentType = PaymentType.CASH;
    public final static Integer amount = 1000;
    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.setDateOfBooking(new Date());
        booking.setId(1);

        Payment payment;

        switch (paymentType){
            case CASH:
                payment = new Payment(new Date(),new Date(), amount, booking);
            case NET_BANKING:
                payment = new Payment(new Date(),new Date(), amount, booking);
            case CREDIT_CARD:
                payment = new Payment(new Date(),new Date(), amount, booking);
            default: payment = new Payment(new Date(),new Date(), amount, booking);

        }

        BookingService bookingService = new BookingService();
        bookingService.startBooking(booking, payment);
    }
}
