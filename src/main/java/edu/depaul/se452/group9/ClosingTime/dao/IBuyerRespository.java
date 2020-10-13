package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBuyerRespository extends MongoRepository<Buyer, Integer> {
}
