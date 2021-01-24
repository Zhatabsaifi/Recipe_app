package zhatab.springframework.Recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
