package edu.depaul.se452.group9.ClosingTime.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.depaul.se452.group9.ClosingTime.entity.Property;
import edu.depaul.se452.group9.ClosingTime.service.PropertyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public Collection<Property> getProperties() { return propertyService.getProperties(); }

    @PostMapping
    public Property postProperty(@RequestBody Property property) { return propertyService.createProperty(property); }

}
