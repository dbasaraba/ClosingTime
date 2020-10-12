package edu.depaul.se452.group9.ClosingTime.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.depaul.se452.group9.ClosingTime.entity.Property;

public interface IPropertyRepository extends MongoRepository<Property, Integer> {

}
