package zhatab.springframework.Recipeapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import zhatab.springframework.Recipeapp.services.RecipeService;

class RecipeControllerTest {

    @Mock
    RecipeService recipeService;

    RecipeController recipeController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeController = new RecipeController(recipeService);
    }

//    @Test
//    void testGetRecipe() throws Exception {
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
//
//        when(recipeService.findById(anyLong())).thenReturn(recipe);
//
//        mockMvc.perform(get("/recipe/show/1"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("recipe/show"));
//    }
//

//    @Test
//    public void testGetNewRecipeForm() throws Exception {
//        RecipeCommand command = new RecipeCommand();
//
//        mockMvc.perform(get("/recipe/new"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("recipe/recipeform"))
//                .andExpect(model().attributeExists("recipe"));
//    }
//
////       @Test
////    public void testPostNewRecipeForm() throws Exception {
////        RecipeCommand command = new RecipeCommand();
////        command.setId(2L);
////
////        when(recipeService.saveRecipeCommand(any())).thenReturn(command);
////
////        mockMvc.perform(post("/recipe")
////                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
////                .param("id", "")
////                .param("description", "some string")
////        )
////                .andExpect(status().is3xxRedirection())
////                .andExpect(view().name("redirect:/recipe/2/show"));
////    }
//
//    @Test
//    public void testGetUpdateView() throws Exception {
//        RecipeCommand command = new RecipeCommand();
//        command.setId(2L);
//
//        when(recipeService.findCommandById(anyLong())).thenReturn(command);
//
//        mockMvc.perform(get("/recipe/1/update"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("recipe/recipeform"))
//                .andExpect(model().attributeExists("recipe"));
//    }

}