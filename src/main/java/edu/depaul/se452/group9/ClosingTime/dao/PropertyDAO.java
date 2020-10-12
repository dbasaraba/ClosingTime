package edu.depaul.se452.group9.ClosingTime.dao;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.depaul.se452.group9.ClosingTime.entity.Property;

@Component
public class PropertyDAO {

    @Autowired
    private IPropertyRepository repository;

    public Collection<Property> getProperties() { return repository.findAll(); }

	public Property createProperty(Property property) { return repository.insert(property); }

}
