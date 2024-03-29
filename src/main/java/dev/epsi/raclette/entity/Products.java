package dev.epsi.raclette.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private Integer stock;

    private String urlImage;


}
