package edu.depaul.se452.group9.closingtime.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Property")
public class Property {

    @Id
    private Integer id;

    private String state;
    private String city;
    private String streetAddress;
    private String description;

    public Integer getId() { return id; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getStreetAddress() { return streetAddress; }

    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}
