package edu.depaul.se452.group9.ClosingTime.controller;

import edu.depaul.se452.group9.ClosingTime.dao.BuyerDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class BuyerController {

    @Autowired
    private BuyerDAO buyerDAO;

    @PostMapping
    public Buyer createBuyer(@RequestBody Buyer buyer) { return buyerDAO.createBuyer(buyer); }

    @GetMapping("/")
    public Collection<Buyer> getBuyers() { return buyerDAO.getBuyers(); }

    @GetMapping("/{id}")
    public Optional<Buyer> getBuyer(@PathVariable("id") String id) { return buyerDAO.getBuyer(id); }

    @PutMapping
    public void updateBuyer(@RequestBody Buyer buyer) { buyerDAO.updateBuyer(buyer); }

    @DeleteMapping("/{id}")
    public void deleteBuyer(@PathVariable("id") String id) { buyerDAO.deleteBuyer(id); }

}
