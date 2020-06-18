package zhatab.springframework.Recipeapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import zhatab.springframework.Recipeapp.domain.Recipe;
import zhatab.springframework.Recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe rec = new Recipe();
        HashSet recData = new HashSet();
        recData.add(rec);

        when(recipeService.getRecipes()).thenReturn(recData);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(),1);      // findAll run here

        verify(recipeRepository,times(1)).findAll();    // findAll method is only invoked  at 1 time until this line and  no more or not less run

    }
}