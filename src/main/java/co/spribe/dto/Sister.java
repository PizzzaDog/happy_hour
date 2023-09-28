package co.spribe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Sister {

    private String name;
    private Integer age;
    private List<String> labels;
}
