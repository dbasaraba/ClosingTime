package edu.depaul.se452.group9.ClosingTime.dao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.depaul.se452.group9.ClosingTime.entity.Messenger;

public interface IMessengerRepository extends MongoRepository <Messenger, String> {
}
