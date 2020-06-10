package zhatab.springframework.Recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zhatab.springframework.Recipeapp.domain.Category;
import zhatab.springframework.Recipeapp.domain.UnitOfMeasure;
import zhatab.springframework.Recipeapp.repositories.CategoryRepository;
import zhatab.springframework.Recipeapp.repositories.UnitOfMeasureRepositry;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepositry unitOfMeasureRepositry;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepositry unitOfMeasureRepositry) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepositry = unitOfMeasureRepositry;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Indian");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepositry.findByDescription("Cup");
        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasur id is : " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
