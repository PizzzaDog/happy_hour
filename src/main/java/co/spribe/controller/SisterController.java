package co.spribe.controller;


import co.spribe.dto.Sister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SisterController {

    @GetMapping("/ulyana/check")
    public Sister getSis() {
        Sister s = new Sister();
        s.setName("Ульяна");
        s.setAge(20);
        s.setLabels(List.of("Лох", "Лингвист", "Почти фронтер"));
        return s;
    }
}
