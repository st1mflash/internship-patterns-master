package ru.liga.internshippatterns.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ScoringResult {
    private final Application application;
    private final ScoringResultType resultType;
    private final BigDecimal amount;
    private final Integer term;
    private final Double rate;
    private final Double eir;

    @Override
    public String toString() {
        return "ScoringResult{" +
               "application=" + application.getName() +
               ", resultType=" + resultType +
               ", amount=" + amount +
               ", term=" + term +
               ", rate=" + rate +
               ", eir=" + eir +
               '}';
    }
}
