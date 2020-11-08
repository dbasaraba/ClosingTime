package edu.depaul.se452.group9.ClosingTime.dao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.depaul.se452.group9.ClosingTime.entity.Offer;

public interface IOfferRepository extends MongoRepository <Offer, String> {
}
