package co.spribe.service;

import co.spribe.model.Counter;
import co.spribe.repository.CounterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CounterService {

    private final CounterRepository counterRepository;

    public void incrementCocktailCount() {
        Counter counter = counterRepository.findById(1).get();
        counter.setCount(counter.getCount() + 1);
        counterRepository.save(counter);
    }

}
