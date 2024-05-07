package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ScoringResult;
import ru.liga.internshippatterns.model.ScoringResultType;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class ScoringServiceImpl implements ScoringService {

    private static ScoringResult receiveScoringResult(Application application) {
        ScoringResult result;

        if (application.getCreditTerm() <= 5) {
            result = new ScoringResult(application, ScoringResultType.REJECTED, null, null, null, null);
        } else if (application.getCreditTerm() <= 10) {
            result = new ScoringResult(application, ScoringResultType.ERROR, null, null, null, null);
        } else if (application.getCreditTerm() <= 12) {
            result = new ScoringResult(application, ScoringResultType.APPROVED, application.getCreditAmount().add(BigDecimal.valueOf(10000)), application.getCreditTerm(), 25.12, 32.123);
        } else {
            result = new ScoringResult(application, ScoringResultType.APPROVED, application.getCreditAmount(), application.getCreditTerm(), 25.12, 32.123);
        }

        System.out.println("Получен результат скоринга: " + result);
        System.out.println("________________________________________________________");
        return result;
    }


    /**
     * Получаем результат скоринга после некоторого ожидания
     * @param application - заявка
     * @return Результат скоринга
     */
    public ScoringResult getScoringResult(Application application) {
        int n = 5;
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Ожидаю ответа от скоринга.." + (n - i));
                TimeUnit.SECONDS.sleep(1);
            }
            return receiveScoringResult(application);
        } catch (InterruptedException e) {
            throw new RuntimeException("Во время ожидания ответа от скоринга произошла ошибка");
        }
    }
}
