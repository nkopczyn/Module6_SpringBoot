package pl.coderslab.module6_springboot;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

// ta klasa odzwierciedla co będzie przesyłane postem
@Builder
@Getter
@Setter
public class TrailDTO {
    private Long startId;
    private Long finishId;

}
