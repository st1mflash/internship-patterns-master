package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;

import java.util.logging.Logger;

public class ScoringWithLogging extends ScoringServiceCachedProxyImpl {
    private final Logger logger = Logger.getLogger(ScoringWithLogging.class.getName());

    public ScoringWithLogging(ScoringServiceImpl scoringService) {
        super(scoringService);
    }

    @Override
    public ScoringResult getScoringResult(Application application) {
        logger.info("Заявка '" + application.getName() + "' - начало скоринга");
        ScoringResult scoringResult = super.getScoringResult(application);
        logger.info("Заявка '" + application.getName() + "' - скоринг завершен");
        return scoringResult;
    }
}
