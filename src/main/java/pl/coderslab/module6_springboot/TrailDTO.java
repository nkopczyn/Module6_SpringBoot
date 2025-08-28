package pl.coderslab.module6_springboot;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

// ta klasa odzwierciedla co będzie przesyłane postem
@Builder
@Getter
@Setter
public class TrailDTO {
    private String trailName;
    private Long startPointId;
    private Long finishPointId;
    private String mountRangeName;

}
