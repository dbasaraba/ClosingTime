package edu.depaul.se452.group9.ClosingTime.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.Getter;

import java.util.List;


@Document(collection = "Seller")
@Data
public class Seller {

    @MongoId
    @Getter
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private List<Property> postedProperties;
}
