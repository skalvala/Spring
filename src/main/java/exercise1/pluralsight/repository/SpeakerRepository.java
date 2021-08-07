package exercise1.pluralsight.repository;

import exercise1.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}