package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;

public interface ScoringService {

    ScoringResult getScoringResult(Application application);
}
