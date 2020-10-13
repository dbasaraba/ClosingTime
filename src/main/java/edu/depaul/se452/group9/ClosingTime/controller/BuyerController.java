package edu.depaul.se452.group9.ClosingTime.controller;

import java.util.Collection;

import edu.depaul.se452.group9.ClosingTime.entity.Buyer;
import edu.depaul.se452.group9.ClosingTime.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/buyer")

public class BuyerController
{
    @Autowired
    private BuyerService buyerService;

    @GetMapping
    public Collection<Buyer> getBuyers() { return buyerService.getBuyers(); }

    @PostMapping
    public Buyer postBuyer(@RequestBody Buyer buyer) { return buyerService.createBuyer(buyer); }
}
