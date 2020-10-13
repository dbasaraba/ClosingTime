package edu.depaul.se452.group9.ClosingTime.controller;

import java.util.Collection;

import edu.depaul.se452.group9.ClosingTime.service.MessengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.depaul.se452.group9.ClosingTime.entity.Messenger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/messenger")
public class MessengerController {

    @Autowired
    private MessengerService messengerService;

    @GetMapping
    public Collection<Messenger> getMessenger() { return messengerService.getMessengers(); }

    @PostMapping
    public Messenger postMessenger(@RequestBody Messenger messenger) { return messengerService.createMessenger(messenger); }

}
