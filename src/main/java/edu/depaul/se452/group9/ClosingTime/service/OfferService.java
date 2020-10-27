package edu.depaul.se452.group9.ClosingTime.service;

import edu.depaul.se452.group9.ClosingTime.dao.PropertyDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.depaul.se452.group9.ClosingTime.dao.OfferDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Offer;

import java.util.Collection;


@Service
public class OfferService {


    @Autowired
    private OfferDAO offerDAO;

    public Collection<Offer> getOffers() { return offerDAO.getOffers(); }

    public Offer createOffer(Offer offer) { return offerDAO.createOffer(offer);
    }


}
