package com.example.mintic.Reto3.model;

import java.io.Serializable;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bike")
public class Bike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    @Column(name = "brand", length = 45, nullable = false)
    private String brand; 
    @Column(name = "`year`")  
    private Integer year;
    @Column(name = "description", length = 250, nullable = false)
    private String description;
    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("bikes")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","client"})
    //@JsonIgnoreProperties({"bike"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","messages"})
    //@JsonIgnoreProperties({"bike"})
    public List<Reservation> reservations;

    

    public Bike(Integer id, String brand, Integer year, String description, String name){
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.name = name;
    }

    public Bike(){

    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
