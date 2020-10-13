package edu.depaul.se452.group9.ClosingTime.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.Getter;

@Document(collection = "Offer")
@Data
public class Offer {

    @MongoId
    @Getter
    private String id;
    public String propertyIDref;
    public long offer;
}
