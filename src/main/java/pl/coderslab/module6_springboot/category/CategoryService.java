package pl.coderslab.module6_springboot.category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }


    public void addCategory(Category cat) {
        categoryRepository.save(cat);
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category getCategoryByIntensity(String intensity) {
        return categoryRepository.findByIntensity(intensity);
    }
}

