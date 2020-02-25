package com.jurecki.spring5recipeapp.repositories;

import com.jurecki.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
