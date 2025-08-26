package jeffersonrolino.com.github.ecommerce.service;

import jeffersonrolino.com.github.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
