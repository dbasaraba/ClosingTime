package edu.depaul.se452.group9.ClosingTime.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;

@Document(collection = "Offers")
@Data
public class Offer {

    @Id
    @Getter
    private String id;

    public String propertyId;

    public int offer;

}
