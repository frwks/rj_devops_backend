package com.sdtest.frwks.repository;

import com.sdtest.frwks.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
