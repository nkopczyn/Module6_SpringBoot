package pl.coderslab.module6_springboot.mountrange;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import pl.coderslab.module6_springboot.Trail;

import java.util.List;

@Entity
@Getter
@Setter
public class MountRange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // private List<Trail> trails;
}
