package co.spribe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cocktails")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cocktail {

    @Id
    private Integer id;
    private String name;
    private String description;
    private String mainAlco;
    private String link;
}
