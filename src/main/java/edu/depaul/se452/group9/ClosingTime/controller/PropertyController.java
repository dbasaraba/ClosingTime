package edu.depaul.se452.group9.ClosingTime.controller;

import edu.depaul.se452.group9.ClosingTime.dao.PropertyDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyDAO propertyDAO;

    @GetMapping
    public List<Property> getSellers() { return propertyDAO.getProperties();}

    @PostMapping
    public Property postProperty(@RequestBody Property property) { return propertyDAO.createProperty(property); }

}
