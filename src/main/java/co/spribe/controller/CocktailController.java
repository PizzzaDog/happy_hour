package co.spribe.controller;

import co.spribe.dto.CocktailCreate;
import co.spribe.model.Cocktail;
import co.spribe.service.CocktailService;
import co.spribe.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class CocktailController {
    private final CocktailService cocktailService;
    private final CounterService counterService;


    @GetMapping("/1")
    @ResponseBody
    public Cocktail getFirst() {
        return cocktailService.getFirst();
    }

    @GetMapping("/cocktail")
    public String getCocktail(Model model) {
        counterService.incrementCocktailCount();
        model.addAttribute(new CocktailCreate());
        return "cocktail";
    }

    @PostMapping("/cocktail")
    public String addCocktail(@ModelAttribute("cocktailCreate") CocktailCreate createDto) {
        cocktailService.createCocktail(createDto);
        return "good";
    }
}
