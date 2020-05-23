package com.vikshen.bookshopservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_authority")
    private int id;

    @Column(name = "authority")
    private String authority;

}
