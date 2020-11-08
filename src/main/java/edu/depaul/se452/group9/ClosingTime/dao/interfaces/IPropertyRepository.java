package edu.depaul.se452.group9.ClosingTime.dao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.depaul.se452.group9.ClosingTime.entity.Property;

public interface IPropertyRepository extends MongoRepository <Property, String> {
}
