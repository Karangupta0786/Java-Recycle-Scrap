package com.ak.Scrapist.AK.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String name;

}
