package edu.depaul.se452.group9.closingtime.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.depaul.se452.group9.closingtime.dao.PropertyDAO;
import edu.depaul.se452.group9.closingtime.entity.Property;

@Service
public class PropertyService {

    @Autowired
    private PropertyDAO propertyDAO;

    public Collection<Property> getProperties() { return propertyDAO.getProperties(); }

	public Property createProperty(Property property) { return propertyDAO.createProperty(property); }

}
