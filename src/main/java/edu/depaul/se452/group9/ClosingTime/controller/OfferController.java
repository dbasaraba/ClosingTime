package edu.depaul.se452.group9.ClosingTime.controller;

import edu.depaul.se452.group9.ClosingTime.dao.OfferDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    private OfferDAO offerDAO;

    @GetMapping
    public Collection<Offer> getOffers() { return offerDAO.getOffers(); }

    @PostMapping
    public Offer postOffer(@RequestBody Offer offer) { return offerDAO.createOffer(offer); }

}
