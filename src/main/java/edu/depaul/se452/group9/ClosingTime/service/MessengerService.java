package edu.depaul.se452.group9.ClosingTime.service;


import java.util.Collection;
import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.depaul.se452.group9.ClosingTime.dao.MessengerDAO;

@Service
public class MessengerService {

    @Autowired
    private MessengerDAO messengerDAO;

    public Collection<Messenger> getMessengers() { return messengerDAO.getMessengers(); }

    public Messenger createMessenger(Messenger messenger) { return messengerDAO.createMessenger(messenger); }

}