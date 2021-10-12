package com.charlie_food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlie_food.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}
