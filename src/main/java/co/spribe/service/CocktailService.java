package co.spribe.service;

import co.spribe.dto.CocktailCreate;
import co.spribe.mapper.CocktailMapper;
import co.spribe.model.Cocktail;
import co.spribe.repository.CocktailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CocktailService {
    private final CocktailRepository cocktailRepository;
    private final CocktailMapper cocktailMapper;


    public Cocktail getFirst() {
        return cocktailRepository.findById(1).get();
    }

    public void createCocktail(CocktailCreate createDto) {
        Cocktail cocktail = cocktailMapper.toCocktail(createDto);
        cocktailRepository.save(cocktail);
    }
}
