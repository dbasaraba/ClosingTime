package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOfferRepository extends MongoRepository<Offer, Integer> {
}
