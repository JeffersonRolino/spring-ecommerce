package jeffersonrolino.com.github.ecommerce.service;

import jeffersonrolino.com.github.ecommerce.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setId((long)categories.size() + 1);
        categories.add(category);
    }
}
