package edu.depaul.se452.group9.ClosingTime.controller;
import java.util.Collection;

import edu.depaul.se452.group9.ClosingTime.entity.Seller;
import edu.depaul.se452.group9.ClosingTime.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.depaul.se452.group9.ClosingTime.entity.Property;
import edu.depaul.se452.group9.ClosingTime.service.PropertyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService SellerService;

    @GetMapping
    public Collection<Seller> getSellers() { return SellerService.getSellers();}

    @PostMapping
    public Seller postSeller(@RequestBody Seller seller) { return SellerService.createSeller(seller); }

}
