package com.ishara.bookingcloud.profileservice.controller;

import com.ishara.bookingcloud.commons.model.Customer;
import com.ishara.bookingcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile",method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer){

        return customerService.save(customer);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)

    public Customer fetch(@RequestParam int id) {

        return customerService.fetchById(id);
    }

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> fetch() {

        return customerService.fetchAllProfiles();
    }

}