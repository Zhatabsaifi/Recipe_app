package zhatab.springframework.Recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zhatab.springframework.Recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
