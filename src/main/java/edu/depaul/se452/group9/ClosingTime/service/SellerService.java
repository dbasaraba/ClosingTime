package edu.depaul.se452.group9.ClosingTime.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.depaul.se452.group9.ClosingTime.dao.SellerDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Seller;

@Service
public class SellerService {
    @Autowired
    private SellerDAO sellerDAO;

    public Collection<Seller> getSellers() {return sellerDAO.getSellers();}

    public Seller createSeller(Seller seller) {return sellerDAO.createSeller(seller);}
}
