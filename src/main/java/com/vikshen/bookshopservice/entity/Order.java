package com.vikshen.bookshopservice.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_order")
    private int id;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name="created")
    private String created;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH, CascadeType.REMOVE}, mappedBy = "order")
    private List<OrderItem> orderItemList;


}
