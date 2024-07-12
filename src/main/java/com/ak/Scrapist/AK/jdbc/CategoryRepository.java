package com.ak.Scrapist.AK.jdbc;

import com.ak.Scrapist.AK.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
