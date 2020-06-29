package zhatab.springframework.Recipeapp.services;

import zhatab.springframework.Recipeapp.commands.IngredientCommand;

public interface IngredientService {
     IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

     IngredientCommand saveIngredientCommand(IngredientCommand command);
}
