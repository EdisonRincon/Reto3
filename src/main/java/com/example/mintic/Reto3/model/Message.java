package com.example.mintic.Reto3.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "message")
public class Message implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idMessage;
    @Column(name = "messageText",length = 250,nullable = false)
    private String messageText;

    @ManyToOne
    @JoinColumn(name="bikeId")
    @JsonIgnoreProperties({"messages","reservations"})
    //@JsonIgnoreProperties({"messages"})
    private Bike bike;


    @ManyToOne
    @JoinColumn(name="clientId")
    //@JsonIgnoreProperties({"messages"})
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    

    public Message(Integer idMessage, String messageText, Bike bike, Client client) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.bike = bike;
        this.client = client;
    }

    public Message(){

    }


    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public Bike getBike() {
        return bike;
    }
    public void setBike(Bike bike) {
        this.bike = bike;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
   
  
}
