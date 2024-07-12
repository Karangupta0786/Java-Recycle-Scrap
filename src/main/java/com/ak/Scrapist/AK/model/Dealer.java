package com.ak.Scrapist.AK.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "dealer_table")
public class Dealer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dealer_name")
    private String name;

    @Column(name = "dealer_adhaar_number")
    private Long adhaarNumber;

    @Column(name = "dealer_image")
    private String dealerImage;

    @Column(name = "dealer_phone")
    private String phone;


    @OneToMany(mappedBy = "dealer",fetch = FetchType.LAZY)
    @JsonIgnoreProperties
    private Set<User> users;

}
