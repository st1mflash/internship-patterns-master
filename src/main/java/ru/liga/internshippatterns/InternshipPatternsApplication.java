package ru.liga.internshippatterns;

import ru.liga.internshippatterns.model.*;
import ru.liga.internshippatterns.service.ApplicationService;
import ru.liga.internshippatterns.service.ScoringService;
import ru.liga.internshippatterns.service.ScoringServiceImpl;

import java.math.BigDecimal;
import java.util.Arrays;

public class InternshipPatternsApplication {

    public static void main(String[] args) {

        Client client = new Client("Коваленко Эдуард Вячеславович", 29, "1212", "123123");
        Application application = client.createApplication(BigDecimal.valueOf(10), 12);

        ApplicationService applicationService = new ApplicationService();
        applicationService.sendOnApprove(application);

        ScoringService scoringService = new ScoringServiceImpl();
        ScoringResult result = scoringService.getScoringResult(application);
        ScoringResult result2 = scoringService.getScoringResult(application);
        ScoringResult result3 = scoringService.getScoringResult(application);

        if (anyResultIsApproved(result, result2, result3)) {
            applicationService.createAgreement(application);
            application.setStatus(ApplicationStatus.DONE);
        }
    }

    private static boolean anyResultIsApproved(ScoringResult... results) {
        return Arrays.stream(results)
                .anyMatch(scoringResult -> scoringResult.getResultType().equals(ScoringResultType.APPROVED));
    }

}
