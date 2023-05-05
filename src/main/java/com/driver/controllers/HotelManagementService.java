package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManagementService {

    @Autowired
    HotelManagementRepository hotelmanagementrepository;

    public String addHotel(Hotel hotel) {
       if( hotelmanagementrepository.addHotel(hotel))
           return "SUCCESS";

       return "FAILURE";
    }

    public Integer addUser(User user) {
        if(hotelmanagementrepository.addUser(user)){
            return user.getaadharCardNo();
        }
        return null;
    }

    public String getHotelWithMostFacilities() {
      return  hotelmanagementrepository.getHotelWithFacilities();
    }

    public int bookARoom(Booking booking) {
//       String hotelName = booking.getHotelName();
      return  hotelmanagementrepository.bookARoom(booking);


    }

    public int getBookings(Integer aadharCard) {
        return hotelmanagementrepository.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelmanagementrepository.updateFacilities(newFacilities, hotelName);
    }
}
