package com.example.demo.controller;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class FrontController {

    @Autowired
    AddressService addressService;

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable int id) {
        return addressService.getAddress(id);
    }
}
