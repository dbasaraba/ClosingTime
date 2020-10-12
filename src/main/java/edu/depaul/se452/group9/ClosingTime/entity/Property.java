package edu.depaul.se452.group9.ClosingTime.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.Getter;


@Document(collection = "Property")
@Data
public class Property {

    @MongoId
    @Getter
    private String id;

    private String state;
    private String city;
    private String streetAddress;
    private String description;

}
