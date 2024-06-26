package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;

import java.util.HashMap;
import java.util.Map;

public class ScoringServiceCachedProxyImpl implements ScoringService {
    private final static Map<Integer, ScoringResult> applicationScoringResult = new HashMap<>();
    private final ScoringService scoringService;

    public ScoringServiceCachedProxyImpl (ScoringService scoringService) {
        this.scoringService = scoringService;
    }

    @Override
    public ScoringResult getScoringResult(Application application) {
        if (!applicationScoringResult.containsKey(application.getCreditTerm())) {
            applicationScoringResult.put(application.getCreditTerm(), scoringService.getScoringResult(application));
        }
        return applicationScoringResult.get(application.getCreditTerm());
    }
}
