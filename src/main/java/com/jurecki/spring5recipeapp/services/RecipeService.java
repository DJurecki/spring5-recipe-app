package com.jurecki.spring5recipeapp.services;

import com.jurecki.spring5recipeapp.commands.RecipeCommand;
import com.jurecki.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
