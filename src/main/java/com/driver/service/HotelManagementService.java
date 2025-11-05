package com.driver.service;

import com.driver.model.Hotel;
import com.driver.repository.HotelManagementRepository;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class HotelManagementService {
    HotelManagementRepository hotelRepo = new HotelManagementRepository();

    public String addHotel(Hotel hotel) {

        if(hotel.getHotelName() == null || hotel == null) {
           return "FAILURE";
        }

        String ans = hotelRepo.addHotel(hotel);
         return ans;
    }
}
