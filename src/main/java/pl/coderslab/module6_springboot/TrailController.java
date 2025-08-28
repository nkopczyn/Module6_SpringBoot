package pl.coderslab.module6_springboot;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.module6_springboot.category.Category;
import pl.coderslab.module6_springboot.category.CategoryService;
import pl.coderslab.module6_springboot.mountrange.MountRange;
import pl.coderslab.module6_springboot.mountrange.MountRangeService;
import pl.coderslab.module6_springboot.point.Point;
import pl.coderslab.module6_springboot.point.PointService;

import java.util.List;

@RestController
@RequestMapping("/trails")
public class TrailController {

    private final TrailService trailService;
    private final CategoryService categoryService;
    private final PointService pointService;
    private final MountRangeService mountRangeService;

    public TrailController(TrailService trailService, CategoryService categoryService, PointService pointService, MountRangeService mountRangeService) {
        this.trailService = trailService;
        this.categoryService = categoryService;
        this.pointService = pointService;
        this.mountRangeService = mountRangeService;
    }


    @Operation(summary = "Pobierz wszystkie trasy", description = "Zwraca listę wszystkich tras")
    @GetMapping("/all")
    public List<Trail> getTrails() {
        return trailService.getAllTrails();
    }


    @PostMapping("/add-post")
    public String addTrail(@RequestBody TrailDTO trailRequest) {
        // Pobierz punkty startowy i końcowy na podstawie przesłanych ID
        Point start = pointService.getPointById(trailRequest.getStartPointId());
        Point finish = pointService.getPointById(trailRequest.getFinishPointId());

        // trail name add
        String trailName = trailRequest.getTrailName();
        MountRange mountRange = mountRangeService.getMountRangeByName(trailRequest.getMountRangeName());

        // Oblicz długość trasy na podstawie współrzędnych punktów
        double length = trailService.calculateTrailLength(start, finish);

        // Ustal kategorię na podstawie długości
        Category category = trailService.determineTrailCategory(length);

        Trail trail = new Trail();
        trail.setName(trailName);
        trail.setStart(start);
        trail.setFinish(finish);
        trail.setLength(length);
        trail.setCategory(category);
        trail.setMountRange(mountRange);

        trailService.addTrail(trail);

        return "trail added via post";
    }
}
