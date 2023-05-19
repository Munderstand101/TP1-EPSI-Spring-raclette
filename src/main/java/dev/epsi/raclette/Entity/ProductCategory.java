package dev.epsi.raclette.Entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Munderstand
 * @created 15/03/2023 - 10:50
 * @project raclette
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name="product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


}
