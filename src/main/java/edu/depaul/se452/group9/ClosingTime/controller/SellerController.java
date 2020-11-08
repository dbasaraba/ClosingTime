package edu.depaul.se452.group9.ClosingTime.controller;

import edu.depaul.se452.group9.ClosingTime.dao.SellerDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerDAO sellerDAO;

    @GetMapping
    public Collection<Seller> getSellers() { return sellerDAO.getSellers();}

    @PostMapping
    public Seller postSeller(@RequestBody Seller seller) { return sellerDAO.createSeller(seller); }

}
