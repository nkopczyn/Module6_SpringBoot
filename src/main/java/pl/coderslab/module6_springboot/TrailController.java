package pl.coderslab.module6_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrailController {

    private final TrailService trailService;

    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }

    @GetMapping("/trails")
    public List<Trail> getTrails() {
        return trailService.getAllTrails();
    }
}
