package com.kooujin.course.services;

import com.kooujin.course.entities.Category;
import com.kooujin.course.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Object findById(Long id) {
        Optional<Category> category =  categoryRepository.findById(id);
        return category.get();
    }
}
