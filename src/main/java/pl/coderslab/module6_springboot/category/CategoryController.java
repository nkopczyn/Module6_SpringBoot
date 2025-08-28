package pl.coderslab.module6_springboot.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String helloCategory() {
        return "Hello category";
    }

    // wykorzystanie ResponseEntity
    @GetMapping("/all")
    public ResponseEntity<List<Category>> showCategories() {
        List<Category> categories = categoryService.getCategories();
        if (categories.isEmpty()) {
            // Zwraca kod 204 No Content, jeśli lista jest pusta
            return ResponseEntity.noContent().build();
        } else {
            // Zwraca kod 200 OK oraz listę kategorii
            return ResponseEntity.ok(categories);
        }
    }


}
