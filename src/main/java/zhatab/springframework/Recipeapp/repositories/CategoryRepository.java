package zhatab.springframework.Recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zhatab.springframework.Recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
