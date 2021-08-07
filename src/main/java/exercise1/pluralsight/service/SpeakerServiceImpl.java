package exercise1.pluralsight.service;

import exercise1.pluralsight.model.Speaker;
import exercise1.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import exercise1.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
