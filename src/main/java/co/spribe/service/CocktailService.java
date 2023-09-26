package co.spribe.service;

import co.spribe.model.Cocktail;
import co.spribe.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocktailService {
    @Autowired
    private CocktailRepository cocktailRepository;

    public Cocktail getFirst() {
        return cocktailRepository.findById(1).get();
    }
}
