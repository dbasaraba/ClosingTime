package edu.depaul.se452.group9.ClosingTime.entity;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Sellers")
@Data
public class Seller {

    @Id
    @Getter
    private String id;

    private String firstName;
    private String lastName;
    private String email;

    private List<Property> properties;
    private List<Messenger> messages;

}
