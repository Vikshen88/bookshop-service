package com.vikshen.bookshopservice.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REFRESH})
    @JoinTable(
            name="users_authorities",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_authority")
    )
    List<Authority> authorities;
}
