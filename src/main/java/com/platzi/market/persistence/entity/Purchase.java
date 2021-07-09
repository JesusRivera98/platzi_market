package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase")
    private Integer idPurchase;

    @Column(name = "id_client")
    private String idClient;

    private LocalDateTime date;

    @Column(name = "payment_method")
    private String paymentMethod;

    private String comment;
    private String state;
}
