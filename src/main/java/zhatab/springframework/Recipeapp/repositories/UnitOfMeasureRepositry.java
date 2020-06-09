package zhatab.springframework.Recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zhatab.springframework.Recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepositry extends CrudRepository<UnitOfMeasure, Long> {
}
