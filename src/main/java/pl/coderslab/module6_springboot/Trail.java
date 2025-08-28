package pl.coderslab.module6_springboot;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.coderslab.module6_springboot.category.Category;

@Entity
@Getter
@Setter
public class Trail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double length;

    @ManyToOne
    @Schema(description = "Kategoria trudności trasy")
    private Category category;

}
