package pl.coderslab.module6_springboot;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.module6_springboot.category.Category;
import pl.coderslab.module6_springboot.category.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/trails")
public class TrailController {

    private final TrailService trailService;
    private final CategoryService categoryService;

    public TrailController(TrailService trailService, CategoryService categoryService) {
        this.trailService = trailService;
        this.categoryService = categoryService;
    }


    @Operation(summary = "Pobierz wszystkie trasy", description = "Zwraca listę wszystkich tras")
    @GetMapping("/all")
    public List<Trail> getTrails() {
        return trailService.getAllTrails();
    }

    @GetMapping("/add")
    public String addTrail() {
        Category cat1 = new Category();
        cat1.setIntensity("średnia");
        categoryService.addCategory(cat1);

        Trail t = new Trail();
        t.setName("morskie oko - zakopane");
        t.setLength(34.5);
        t.setCategory(cat1);
        return trailService.addTrail(t);
    }
}
