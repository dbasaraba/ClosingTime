package edu.depaul.se452.group9.ClosingTime.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.depaul.se452.group9.ClosingTime.dao.BuyerDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Buyer;

@Service
public class BuyerService
{
    @Autowired
    private BuyerDAO buyerDAO;

    public Collection<Buyer> getBuyers() {return buyerDAO.getBuyers();}

    public Buyer createBuyer(Buyer buyer) {return buyerDAO.createBuyer(buyer);}
}
