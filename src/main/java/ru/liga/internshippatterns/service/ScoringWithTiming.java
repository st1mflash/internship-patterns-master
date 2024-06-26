package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;

public class ScoringWithTiming extends ScoringServiceCachedProxyImpl {
    public ScoringWithTiming(ScoringServiceImpl scoringService) {
        super(scoringService);
    }

    @Override
    public ScoringResult getScoringResult(Application application) {
        long startTime = System.currentTimeMillis();
        ScoringResult scoringResult = super.getScoringResult(application);
        long endTime = System.currentTimeMillis();
        System.out.println("Заявка '" + application.getName() + "' - скоринг завершен за " + (endTime - startTime) + " ms");
        return scoringResult;
    }
}
