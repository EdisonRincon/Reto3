package com.example.mintic.Reto3.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "score")
public class Score implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    @Column(name = "messageText",length = 250,nullable = false)
    private String messageText;
    @Column(name="stars",scale = 5,nullable = false)
    private Integer stars;

    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    

    public Score(Integer idScore, Integer stars) {
        this.idScore = idScore;
        this.stars = stars;
    }

    public Score(){

    }



    public Integer getIdScore() {
        return idScore;
    }
    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public Integer getStars() {
        return stars;
    }
    public void setStars(Integer stars) {
        this.stars = stars;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
   
  
}
