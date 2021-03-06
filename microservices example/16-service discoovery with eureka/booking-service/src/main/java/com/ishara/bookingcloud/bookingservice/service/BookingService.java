package com.ishara.bookingcloud.bookingservice.service;

import com.ishara.bookingcloud.bookingservice.model.DetailResponse;
import com.ishara.bookingcloud.model.booking.Booking;

import java.util.List;

public interface BookingService {
    Booking save(Booking customer);
    Booking findById (int id);
    List<Booking> findAll();
    DetailResponse findDetailResponse(int id);
}
