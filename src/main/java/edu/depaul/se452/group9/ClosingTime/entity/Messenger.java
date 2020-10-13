package edu.depaul.se452.group9.ClosingTime.entity;


import org.apache.logging.log4j.message.Message;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.util.List;
import lombok.Data;
import lombok.Getter;


@Document(collection = "Messenger")
@Data
public class Messenger{

    @MongoId
    @Getter
    private List<Message> Message;
    private String SellerID;
    private String BuyerID;
    private String msgID;

}
