package zhatab.springframework.Recipeapp.services;

import zhatab.springframework.Recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
