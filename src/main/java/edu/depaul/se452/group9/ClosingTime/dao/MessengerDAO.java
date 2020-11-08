package edu.depaul.se452.group9.ClosingTime.dao;

import edu.depaul.se452.group9.ClosingTime.dao.interfaces.IMessengerRepository;
import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessengerDAO {

    @Autowired
    private IMessengerRepository repository;

    public Messenger createMessenger(Messenger messenger) { return repository.insert(messenger); }

    public List<Messenger> getMessengers() { return repository.findAll(); }

}
