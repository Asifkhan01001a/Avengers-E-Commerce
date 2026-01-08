package AvengersModel;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    private int quantity;

    Cart cart;

    Product product;

    @Column(nullable = false)
    private BigDecimal priceAtAddTime;

    private BigDecimal discountAtAddTime;


}
