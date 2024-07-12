package com.ak.Scrapist.AK.util;

import com.ak.Scrapist.AK.jdbc.CategoryRepository;
import com.ak.Scrapist.AK.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

public class DataLoader implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        if (categoryRepository.count() == 0){
            List<String> categoryNames = Arrays.asList("Loha","Tamba","Gatta","Paper",
                    "Books","Rough NoteBook","Kaanch","Plastic","Kali Plastic","Botal",
                    "Steel","Teen","Aluminium","Peetal","Plastic Pipes","Mix");

            for (String name : categoryNames){
                Category category = new Category();
                category.setName(name);
                categoryRepository.save(category);
            }

        }

    }
}
