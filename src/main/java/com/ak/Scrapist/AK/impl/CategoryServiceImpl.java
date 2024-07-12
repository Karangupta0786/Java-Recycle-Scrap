package com.ak.Scrapist.AK.impl;

import com.ak.Scrapist.AK.jdbc.CategoryRepository;
import com.ak.Scrapist.AK.model.Category;
import com.ak.Scrapist.AK.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> fetchAllCategories() {
        return categoryRepository.findAll();
    }
}
