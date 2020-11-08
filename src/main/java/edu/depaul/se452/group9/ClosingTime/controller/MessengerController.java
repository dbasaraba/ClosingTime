package edu.depaul.se452.group9.ClosingTime.controller;

import edu.depaul.se452.group9.ClosingTime.dao.MessengerDAO;
import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/messages")
public class MessengerController {

    @Autowired
    private MessengerDAO messengerDAO;

    @GetMapping
    public Collection<Messenger> getMessages() { return messengerDAO.getMessengers(); }

    @PostMapping
    public Messenger postMessages(@RequestBody Messenger messenger) { return messengerDAO.createMessenger(messenger); }

}
