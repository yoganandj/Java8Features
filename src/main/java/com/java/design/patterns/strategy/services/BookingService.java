package com.java.design.patterns.strategy.services;

import com.java.design.patterns.strategy.Booking;
import com.java.design.patterns.strategy.Payment;
import com.java.design.patterns.strategy.util.PaymentType;

public class BookingService {



    public boolean startBooking(Booking booking, Payment payment){
        System.out.println(payment);

        return false;
    }
}
