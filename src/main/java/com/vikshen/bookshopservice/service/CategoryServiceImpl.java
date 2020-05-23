package com.vikshen.bookshopservice.service;

import com.vikshen.bookshopservice.entity.Category;
import com.vikshen.bookshopservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
