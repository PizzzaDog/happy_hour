package co.spribe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement
public class CocktailCreate {
    private String name;
    private String description;
    private String mainAlco;
    private String link;

}
