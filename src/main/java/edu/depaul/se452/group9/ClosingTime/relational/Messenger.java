package edu.depaul.se452.group9.ClosingTime.relational;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class Messenger {
    @Id 
    @GeneratedValue
    private String chatID;
    private String buyerID;
    private String sellerID;    
    private String messageBody;


    public Messenger(String buyerID, String sellerID, String messageBody){

        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.messageBody = messageBody;
    }

    @Override
    public String toString(){
        return String.format("Messenger[buyerID='%s', sellerID='%s', messageBody='%s']",
        buyerID,sellerID,messageBody);
    }

    


    /**
     * @return String return the chatID
     */
    public String getChatID() {
        return chatID;
    }

    /**
     * @param chatID the chatID to set
     */
    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    /**
     * @return String return the buyerID
     */
    public String getBuyerID() {
        return buyerID;
    }

    /**
     * @param buyerID the buyerID to set
     */
    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    /**
     * @return String return the sellerID
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * @param sellerID the sellerID to set
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    /**
     * @return String return the messageBody
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * @param messageBody the messageBody to set
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

}