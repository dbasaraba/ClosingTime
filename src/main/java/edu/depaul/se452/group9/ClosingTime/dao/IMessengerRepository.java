package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMessengerRepository extends MongoRepository<Messenger, String> {

}
