package com.ak.Scrapist.AK.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    @JsonProperty("user_name")
    private String name;

    @Column(name = "user_address")
    @JsonProperty("user_address")
    private String address;

    @Column(name = "user_phone")
    @JsonProperty("user_phone")
    private String phone;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "user_dealer_table",
    joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "dealer_id",referencedColumnName = "id"))
    @JsonIgnoreProperties
    private Dealer dealer;
}
