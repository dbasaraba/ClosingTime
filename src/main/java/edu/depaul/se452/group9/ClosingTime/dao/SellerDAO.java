package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SellerDAO {
    @Autowired
    private ISellerRepository repository;

    public Collection<Seller> getSellers() {return repository.findAll(); }

    public Seller createSeller(Seller seller) { return repository.insert(seller); }
}
