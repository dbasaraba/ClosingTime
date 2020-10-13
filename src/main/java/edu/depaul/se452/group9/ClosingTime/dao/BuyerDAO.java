package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BuyerDAO
{
    @Autowired
    private IBuyerRespository repository;

    public Collection<Buyer> getBuyers() {return repository.findAll(); }

    public Buyer createBuyer(Buyer buyer) { return repository.insert(buyer); }
}
