package dev.epsi.raclette.entity;

import jakarta.persistence.*;
import lombok.Value;

public class Products {

    @Entity
    @Table(name = "product")
    public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String description;

        private Double price;

        private Integer stock;

        // constructeurs, getters, setters, etc.
    }

}
