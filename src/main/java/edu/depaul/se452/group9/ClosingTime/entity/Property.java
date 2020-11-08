package edu.depaul.se452.group9.ClosingTime.entity;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Properties")
@Data
public class Property {

    @Id
    @Getter
    private String id;

    private String state;
    private String city;
    private String streetAddress;

    private int askingPrice;

    private List<Offer> offers;

}
