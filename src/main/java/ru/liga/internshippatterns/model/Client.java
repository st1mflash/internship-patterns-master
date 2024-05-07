package ru.liga.internshippatterns.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Client {
    private final String fio;
    private final int age;
    private final String passportSeries;
    private final String passportNumber;

    /**
     * Клиент приходит на сайт банка и вбивает свои данные для получения кредита
     *
     * @param creditAmount - сумма кредита
     * @param creditTerm   - срок кредита
     * @return предзаполненная заявка/анкета
     */
    public Application createApplication(BigDecimal creditAmount, int creditTerm) {

        Application application = new Application.ApplicationBuilder(
                "Кредитная заявка для клиента " + fio,
                this,
                creditAmount,
                creditTerm
        )
                .status(ApplicationStatus.NEW)
                .build();

        System.out.println("Клиент завел заявку на кредит: " + application);
        System.out.println("________________________________________________________");
        return application;
    }
}