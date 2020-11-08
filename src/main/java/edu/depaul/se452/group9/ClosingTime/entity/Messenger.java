package edu.depaul.se452.group9.ClosingTime.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;

@Document(collection = "Messenger")
@Data
public class Messenger{

    @Id
    @Getter
    private String id;

    private String buyerID;
    private String sellerID;
    private String messageBody;

}
