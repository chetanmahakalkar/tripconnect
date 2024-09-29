package com.cybage.tripconnect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {


    @GetMapping("/hotel")
    public String getData() {
        return "Please book hotel from tripConnect with 75% discount in Maharashtra";
    }
}
