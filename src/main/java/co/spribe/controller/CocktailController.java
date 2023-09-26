package co.spribe.controller;

import co.spribe.dto.CocktailCreate;
import co.spribe.model.Cocktail;
import co.spribe.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CocktailController {
    @Autowired
    CocktailService cocktailService;

    @GetMapping("/1")
    @ResponseBody
    public Cocktail getFirst() {
        return cocktailService.getFirst();
    }

    @GetMapping("/cocktail")
    public String getCocktail(Model model) {
        model.addAttribute(new CocktailCreate());
        return "cocktail";
    }

    @PostMapping("/cocktail")
    public String addCocktail(@ModelAttribute("cocktailCreate") CocktailCreate createDto) {
        cocktailService.createCocktail(createDto);
        return "good";
    }
}
