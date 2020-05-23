package com.vikshen.bookshopservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;
}
