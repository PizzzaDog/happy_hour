package co.spribe.mapper;

import co.spribe.dto.CocktailCreate;
import co.spribe.model.Cocktail;
import org.springframework.stereotype.Service;

@Service
public class CocktailMapper {

    public Cocktail toCocktail(CocktailCreate createDto) {
        Cocktail cocktail = new Cocktail();
        cocktail.setName(createDto.getName());
        cocktail.setMainAlco(createDto.getMainAlco());
        cocktail.setDescription(createDto.getDescription());
        cocktail.setLink(createDto.getLink());
        return cocktail;
    }
}
