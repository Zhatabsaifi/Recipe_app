package zhatab.springframework.Recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zhatab.springframework.Recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
