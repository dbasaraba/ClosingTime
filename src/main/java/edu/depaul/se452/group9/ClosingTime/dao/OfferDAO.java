package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class OfferDAO {

    @Autowired
    private IOfferRepository repository;

    public Collection<Offer> getOffers() {return repository.findAll(); }

    public Offer createOffer(Offer offer) { return repository.insert(offer); }
}
