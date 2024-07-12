package com.ak.Scrapist.AK.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dealer_price_table")
public class DealerPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_price")
    private Double price;

    @ManyToOne
    private Dealer dealer;

    @ManyToOne
    private Category category;

}
