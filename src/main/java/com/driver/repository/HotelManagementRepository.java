package com.driver.repository;

import com.driver.model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class HotelManagementRepository {

    private HashMap<String , Hotel> hotelHashMap;

        public HotelManagementRepository(){
            hotelHashMap = new HashMap<>();
        }


    public String addHotel(Hotel hotel) {
            String ans;
            String name = hotel.getHotelName();

            if(!hotelHashMap.containsKey(name)){
                hotelHashMap.put(name , hotel);
                ans = "SUCCESS";
            }

            else ans = "FAILURE";
            return ans;
    }
}
