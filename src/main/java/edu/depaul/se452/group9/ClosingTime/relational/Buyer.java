
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
public class Buyer {
    @Id 
    @GeneratedValue
    private int sellerID;
    private String firstName;
    private String lastName;
    private String Email;

    public Buyer(String firstName, String lastName, String Email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
    }

    @Override
    public String toString(){
        return String.format("Buyer[sellerID=%d, firstName='%s', lastName='%s', Email='%s']",
        sellerID,firstName,lastName,Email);
    }

    

    /**
     * @return int return the sellerID
     */
    public int getSellerID() {
        return sellerID;
    }

    /**
     * @param sellerID the sellerID to set
     */
    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

}
