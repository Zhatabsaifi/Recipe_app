package zhatab.springframework.Recipeapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import zhatab.springframework.Recipeapp.domain.Recipe;
import zhatab.springframework.Recipeapp.services.RecipeService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        // given
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(new Recipe());
        Recipe rr = new Recipe();
        rr.setId(1L);
        recipeSet.add(rr);

        when(recipeService.getRecipes()).thenReturn(recipeSet);

        ArgumentCaptor<Set<Recipe>> arugumentCaptor = ArgumentCaptor.forClass(Set.class);

        //when
        String val = indexController.getIndexPage(model);

        //then
        assertEquals("index",val);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),arugumentCaptor.capture());
        Set<Recipe> recipeSet1 = arugumentCaptor.getValue();
        assertEquals(2,recipeSet1.size());
    }
}