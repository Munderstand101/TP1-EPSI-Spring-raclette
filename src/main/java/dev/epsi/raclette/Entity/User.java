package dev.epsi.raclette.Entity;

import jakarta.persistence.*;
import lombok.*;
//import javax.validation.constraints.NotBlank;

/**
 * @author Munderstand
 * @created 13/03/2023 - 08:48
 * @project raclette
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    //@NotBlank(message = "Name is mandatory")
    private String name;

 //   @NotBlank(message = "Email is mandatory")
    private String email;

}