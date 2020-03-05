package com.jurecki.spring5recipeapp.services;

import com.jurecki.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
