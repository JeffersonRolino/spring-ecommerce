package jeffersonrolino.com.github.ecommerce.controller;

import jeffersonrolino.com.github.ecommerce.model.Category;
import jeffersonrolino.com.github.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Category added successfully";
    }

    @DeleteMapping("/api/public/categories/{id}")
    public String deleteCategory(@PathVariable Long id){
        String status = categoryService.deleteCategory(id);
        return status;
    }
}
