package zhatab.springframework.Recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zhatab.springframework.Recipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findAllByDescription(String description);
}
