package edu.depaul.se452.group9.ClosingTime.entity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Document(collection = "Buyer")
@Data
public class Buyer
{
    private String firstName;
    private int sellerID;
    private String lastName;
    private String Email;
    private List<edu.depaul.se452.group9.closingtime.entity.Property> preference;
    private List<edu.depaul.se452.group9.closingtime.entity.Property> favorites;

}
