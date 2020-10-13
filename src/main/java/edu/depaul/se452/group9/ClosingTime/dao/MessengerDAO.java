package edu.depaul.se452.group9.ClosingTime.dao;

import java.util.Collection;
import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessengerDAO {

    @Autowired
    private IMessengerRepository repository;

    public Collection<Messenger> getMessengers() { return repository.findAll(); }

    public Messenger createMessenger(Messenger messenger) { return repository.insert(messenger); }

}