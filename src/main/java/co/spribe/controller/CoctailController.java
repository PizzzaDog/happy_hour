package co.spribe.controller;

import co.spribe.model.Cocktail;
import co.spribe.service.CocktailService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoctailController {
    @Autowired
    CocktailService cocktailService;

    @GetMapping("/1")
    @ResponseBody
    public Cocktail getFirst() {
        return cocktailService.getFirst();
    }
}
