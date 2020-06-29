package zhatab.springframework.Recipeapp.services;

import zhatab.springframework.Recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
