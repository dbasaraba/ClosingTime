package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.dao.interfaces.ISellerRepository;
import edu.depaul.se452.group9.ClosingTime.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SellerDAO {

    @Autowired
    private ISellerRepository repository;

    public Seller createSeller(Seller seller) { return repository.insert(seller); }

    public List<Seller> getSellers() {return repository.findAll(); }

}
