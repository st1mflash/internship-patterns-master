package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;

import java.util.logging.Logger;

public class ScoringWithLoggingAndTiming extends ScoringServiceCachedProxyImpl {
    private final Logger logger = Logger.getLogger(ScoringWithLogging.class.getName());

    public ScoringWithLoggingAndTiming(ScoringServiceImpl scoringService) {
        super(scoringService);
    }

    @Override
    public ScoringResult getScoringResult(Application application) {
        logger.info("Заявка '" + application.getName() + "' - начало скоринга");
        long startTime = System.currentTimeMillis();
        ScoringResult scoringResult = super.getScoringResult(application);
        long endTime = System.currentTimeMillis();
        logger.info("Заявка '" + application.getName() + "' - скоринг завершен за " + (endTime - startTime) + " ms");
        return scoringResult;
    }
}
